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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode n = root;
        q.offer(n);
        while (!q.isEmpty()) {
            n = q.poll();
            if (n.right != null) {
                q.offer(n.right);
            }
            if (n.left != null) {
                q.offer(n.left);
            }
        }
        return n.val;
    }
}
