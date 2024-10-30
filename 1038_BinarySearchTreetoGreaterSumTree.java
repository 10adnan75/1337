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
    public TreeNode bstToGst(TreeNode root) {
        int[] hash = new int[101];
        dfs(root, hash);
        return dfsToGst(root, hash);
    }

    public TreeNode dfsToGst(TreeNode node, int[] hash) {
        if (node == null) {
            return node;
        }
        int val = node.val;
        for (int i=node.val+1; i<=100; i++) {
            if (hash[i] != 0) {
                val += i;
            }
        }
        node.val = val;
        dfsToGst(node.left, hash);
        dfsToGst(node.right, hash);
        return node;
    }

    public void dfs(TreeNode node, int[] hash) {
        if (node == null) {
            return;
        }
        hash[node.val]++;
        dfs(node.left, hash);
        dfs(node.right, hash);
    }
}
