// TLE @ TC #84/85
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
