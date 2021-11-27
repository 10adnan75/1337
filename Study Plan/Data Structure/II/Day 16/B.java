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
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Integer> l = new ArrayList<>();
        l.add(root.val);
        dfs(root, targetSum-root.val, result, l);
        return result;
    }
    
    public void dfs(TreeNode t, int sum, List<List<Integer>> result, List<Integer> l) {
        if (t.left == null && t.right == null && sum == 0) {
            List<Integer> temp = new ArrayList<>();
            temp.addAll(l);
            result.add(temp);
        }
        if (t.left != null) {
            l.add(t.left.val);
            dfs(t.left, sum-t.left.val, result, l);
            l.remove(l.size() - 1);
        }
        if (t.right != null) {
            l.add(t.right.val);
            dfs(t.right, sum-t.right.val, result, l);
            l.remove(l.size() - 1);
        }
    }
}
