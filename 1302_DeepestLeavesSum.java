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
    private int sum = 0, maxD = 0;

    public int deepestLeavesSum(TreeNode root) {
        maxDepth(root, 0);
        dfs(root, 0);
        return this.sum;
    }

    public void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (depth == this.maxD) {
            sum += root.val;
        }
        if (root.left != null) {
            dfs(root.left, depth+1);
        }
        if (root.right != null) {
            dfs(root.right, depth+1);
        }
    }

    public void maxDepth(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        maxD = Math.max(maxD, depth);
        if (root.left != null) {
            maxDepth(root.left, depth+1);
        }
        if (root.right != null) {
            maxDepth(root.right, depth+1);
        }
    }
}
