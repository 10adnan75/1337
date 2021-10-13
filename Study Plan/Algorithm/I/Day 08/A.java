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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        int data = 0;
        if (root1 != null) {
            data += root1.val;
        }
        if (root2 != null) {
            data += root2.val;
        }
        TreeNode ans = new TreeNode(data);
        ans.left = mergeTrees(root1 == null ? null : root1.left, root2 == null ? null : root2.left);
        ans.right = mergeTrees(root1 == null ? null : root1.right, root2 == null ? null : root2.right);
        return ans;
    }
}
