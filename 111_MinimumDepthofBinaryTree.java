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
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 1;
        while (!q.isEmpty()) {
            int N = q.size();
            while (N-- > 0) {
                TreeNode node = q.remove();
                if (node == null) {
                    continue;
                }
                if (node.left == null && node.right == null) {
                    return depth;
                }
                q.add(node.left);
                q.add(node.right);
            }
            depth++;
        }
        return -1;
    }
}
