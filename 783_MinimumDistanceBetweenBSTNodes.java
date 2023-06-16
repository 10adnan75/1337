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
    public int min = Integer.MAX_VALUE;
    public TreeNode prevNode = null;

    public void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        if (prevNode != null) {
            min = Math.min(min, node.val - prevNode.val);
        }
        prevNode = node;
        inOrderTraversal(node.right);
    }

    public int minDiffInBST(TreeNode root) {
        inOrderTraversal(root);
        return min;
    }
}
