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
    
    /* private boolean isSymmetric(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        }
        if (l == null || r == null) {
            return false;
        }
        return (l.val == r.val) && (isSymmetric(l.left, r.right)) && (isSymmetric(r.left, l.right));
    } */
    
    public boolean isSymmetric(TreeNode root) {
        
        // Recursion - Runtime: 0 ms, Memory: 39.1 MB
        /* if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right); */
        
        // Iteration - Runtime: 1 ms, Memory: 39.5 MB
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        Queue<TreeNode> left = new LinkedList<>();
        Queue<TreeNode> right = new LinkedList<>();
        left.add(root.left); right.add(root.right);
        TreeNode l = null, r = null;
        while (!left.isEmpty() && !right.isEmpty()) {
            l = left.poll(); r = right.poll();
            if (l == null && r == null) {
                continue;
            } else if ((l == null || r == null) || (l.val != r.val)) {
                return false;
            } else {
                left.add(l.left); 
                left.add(l.right);
                right.add(r.right); 
                right.add(r.left);
            }
        }
        return true;
    }
}
