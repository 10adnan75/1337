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
