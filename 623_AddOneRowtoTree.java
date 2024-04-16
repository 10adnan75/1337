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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        int d = 0;
        List<List<TreeNode>> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (true) {
            d = q.size();
            if (d == 0) {
                break;
            }
            List<TreeNode> ll = new ArrayList<>();
            while (d-- > 0) {
                TreeNode n = q.peek();
                ll.add(n);
                q.poll();
                if (n.left != null) {
                    q.offer(n.left);
                }
                if (n.right != null) {
                    q.offer(n.right);
                }
            }
            l.add(ll);
        }
        d = 1;
        for (List<TreeNode> ll: l) {
            if (++d == depth) {
                for (TreeNode n: ll) {
                    TreeNode left = n.left, right = n.right, newLeft = new TreeNode(val), newRight = new TreeNode(val);
                    n.left = newLeft;
                    n.right = newRight;
                    newLeft.left = left;
                    newRight.right = right;
                }
                break;
            }
        }
        return root;
    }
}
