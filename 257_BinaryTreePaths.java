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
    private List<String> paths = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root.left == null && root.right == null) {
            paths.add(root.val + "");
            return paths;
        }
        dfs(root, new StringBuilder());
        return paths;
    }

    public void dfs(TreeNode node, StringBuilder sb) {
        if (node.left == null && node.right == null) {
            paths.add(sb.toString() + node.val);
            return;
        }
        sb.append(node.val).append("->");
        StringBuilder dummy = new StringBuilder(sb);
        if (node.left != null) {
            dfs(node.left, dummy);
        }
        if (node.right != null) {
            dfs(node.right, sb);
        }
    }
}
