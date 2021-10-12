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
    
    public List<Integer> ans = new ArrayList<>();
    
    /* private void postorderTraversal(TreeNode node, List<Integer> ans) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        ans.add(node.val);
    } */
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        // Recursive - Runtime: 0 ms, Memory: 39.1 MB
        /* postorderTraversal(root, ans);
        return ans; */
      
        // Iterative - Runtime: 1 ms, Memory: 39.1 MB
        if (root == null) {
            return ans;
        }
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while (!s1.isEmpty()) {
            TreeNode temp = s1.pop();
            s2.push(temp);
            if (temp.left != null) {
                s1.push(temp.left);
            }
            if (temp.right != null) {
                s1.push(temp.right);
            }
        }
        while (!s2.isEmpty()) {
            ans.add(s2.pop().val);
        }
        return ans;
    }
}
