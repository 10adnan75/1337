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
    public TreeNode searchBST(TreeNode root, int val) {
        
        // Recursive - Runtime: 0 ms, Memory: 48.7 MB
        /* if (root == null) {
            return root;
        }
        if (root.val > val) {
            return searchBST(root.left, val);
        }
        if (root.val < val) {
            return searchBST(root.right, val);
        }
        return root; */
        
        // Iterative - Runtime: 0 ms, Memory: 48.7 MB
        while (root != null) {
            if (val > root.val) {
                root = root.right;
            } else if (val < root.val) {
                root = root.left;
            } else {
                break;
            }
        }
        return root;
    }
}
