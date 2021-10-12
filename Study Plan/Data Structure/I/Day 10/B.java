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
    
    List<Integer> ans = new ArrayList<>();
    
    private void helper(TreeNode temp) {
        if (temp.left != null) {
            helper(temp.left);
        }
        ans.add(temp.val);
        if (temp.right != null) {
            helper(temp.right);
        }
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        // Recursive - Runtime: 0 ms, Memory: 37.2 MB
        /* if (root != null) {
            helper(root);
        }
        return ans; */
      
        // Iterative - Runtime: 0 ms, Memory: 37.6 MB
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (temp != null) {
            stack.push(temp);
            temp = temp.left;
        }
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            ans.add(node.val);
            node = node.right;
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
        return ans;
    }
}
