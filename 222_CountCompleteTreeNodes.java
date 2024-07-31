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
    private int c = 0;

    public int countNodes(TreeNode root) {
        dfs(root, this.c);
        return this.c;
    }

    public void dfs(TreeNode node, int c) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            dfs(node.left, this.c);
        }
        if (node.right != null) {
            dfs(node.right, this.c);
        }
        this.c++;
    }
}
