// TLE @ TC #84/85 :(
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        int rootVal = 0;
        Set<Integer> parents = new HashSet<>();
        for (int[] desc: descriptions) {
            parents.add(desc[1]);
        }
        for (int[] desc: descriptions) {
            if (!parents.contains(desc[0])) {
                rootVal = desc[0];
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);
        dfs(root, descriptions);
        return root;
    }

    public void dfs(TreeNode node, int[][] desc) {
        if (node == null) {
            return;
        }
        int leftC = getVal(desc, node.val, 1), rightC = getVal(desc, node.val, 0);
        if (leftC != -1) {
            node.left = new TreeNode(leftC);
            dfs(node.left, desc);
        }
        if (rightC != -1) {
            node.right = new TreeNode(rightC);
            dfs(node.right, desc);
        }
    }

    public int getVal(int[][] desc, int parent, int child) {
        for (int[] d: desc) {
            if (d[0] == parent && d[2] == child) {
                return d[1];
            }
        }
        return -1;
    }
}

// Note: if TLE using []'s, use HashMaps :)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private Map<Integer, int[]> map = new HashMap<>();

    public TreeNode createBinaryTree(int[][] descriptions) {
        int rootVal = 0;
        createMap(descriptions);
        Set<Integer> parents = new HashSet<>();
        for (int[] desc: descriptions) {
            parents.add(desc[1]);
        }
        for (int[] desc: descriptions) {
            if (!parents.contains(desc[0])) {
                rootVal = desc[0];
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);
        dfs(root, descriptions);
        return root;
    }

    public void dfs(TreeNode node, int[][] desc) {
        if (node == null) {
            return;
        }
        int[] childs = map.get(node.val);
        if (childs != null && childs[0] != 0) {
            node.left = new TreeNode(childs[0]);
            dfs(node.left, desc);
        }
        if (childs != null && childs[1] != 0) {
            node.right = new TreeNode(childs[1]);
            dfs(node.right, desc);
        }
    }

    public void createMap(int[][] desc) {
        for (int[] d: desc) {
            int k = d[0];
            int[] key = new int[2];
            if (map.containsKey(k)) {
                key = map.get(k);
            }
            if (d[2] == 1) {
                key[0] = d[1];
            } else {
                key[1] = d[1];
            }
            map.put(k, key);
        }
    }
}
