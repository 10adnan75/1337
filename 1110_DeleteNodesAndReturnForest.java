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
    
    private Set<Integer> set = new HashSet<>();
    private List<TreeNode> disjointTrees = new ArrayList<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for (int i: to_delete) {
            set.add(i);
        }
        dfs(root);
        updateTree(root);
        if (root.val != 0) {
            disjointTrees.add(root);
        }
        return disjointTrees;
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        dfs(node.right);
        if (set.contains(node.val)) {
            if (node.left != null && node.left.val != 0) {
                disjointTrees.add(node.left);
            }
            if (node.right != null && node.right.val != 0) {
                disjointTrees.add(node.right);
            }
            node.val = 0;
        }
        if (node.left != null && node.left.val == 0) {
            node.left = null;
        }
        if (node.right != null && node.right.val == 0) {
            node.right = null;
        }
    }

    public void updateTree(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left != null && node.left.val == 0) {
            node.left = null;
        }
        if (node.right != null && node.right.val == 0) {
            node.right = null;
        }
        updateTree(node.left);
        updateTree(node.right);
    }
}
