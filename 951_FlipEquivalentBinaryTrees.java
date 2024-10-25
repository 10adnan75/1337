// Need to work on this!
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
    int[][] levels = new int[100][100];

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        dfs(root1, 0, 1);
        dfs(root2, 0, -1);
        for (int[] level: levels) {
            for (int l: level) {
                if (l != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void dfs(TreeNode node, int l, int c) {
        if (node == null) {
            return;
        }
        levels[l][node.val] += c;
        dfs(node.left, l+1, c);
        dfs(node.right, l+1, c);
    }
}

// my code
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
    private int size = 0;

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        int[][] r1 = new int[100][2], r2 = new int[100][2];

        dfs(root1, r1, 1);
        dfs(root2, r2, -1);

        if (size != 0) {
            return false;
        }

        for (int i=0; i<100; i++) {
            Arrays.sort(r1[i]);
            Arrays.sort(r2[i]);
        }

        for(int i=0; i<100; i++) {
            if (r1[i][0] != r2[i][0] || r1[i][1] != r2[i][1]) {
                return false;
            }
        }

        return true;
    }

    public void dfs(TreeNode node, int[][] levels, int c) {
        if (node == null) {
            return;
        }

        size += c;

        if (node.left != null) {
            levels[node.val][0] = node.left.val;
            dfs(node.left, levels, c);
        }
        
        if (node.right != null) {
            levels[node.val][1] = node.right.val;
            dfs(node.right, levels, c);
        }
    }
}
