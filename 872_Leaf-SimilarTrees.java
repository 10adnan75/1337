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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>(), l2 = new ArrayList<>();
        dfs(root1, l1); dfs(root2, l2);
        return areEqual(l1, l2);
    }

    public void dfs(TreeNode root, List<Integer> l) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                l.add(root.val);
            }
            dfs(root.left, l);
            dfs(root.right, l);
        }
    }

    public boolean areEqual(List<Integer> l1, List<Integer> l2) {
        int n = l1.size() == l2.size() ? l1.size() : -1;
        if (n == -1) {
            return false;
        }
        for (int i=0; i<n; i++) {
            if (l1.get(i) != l2.get(i)) {
                return false;
            }
        }
        return true;
    }
}
