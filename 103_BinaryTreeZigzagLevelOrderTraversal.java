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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        Boolean zigzag = false;
        while (!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> dummy = new LinkedList<>();
            for (int i=0; i<size; i++) {
                TreeNode data = q.poll();
                if (zigzag) {
                    dummy.add(0, data.val);
                } else {
                    dummy.add(data.val);
                }
                if (data.left != null) {
                    q.offer(data.left);
                }
                if (data.right != null) {
                    q.offer(data.right);
                }
            }
            result.add(dummy);
            zigzag = !zigzag;
        }
        return result;
    }
}
