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
    private List<Integer> ans = new ArrayList<>();

    public void addElements(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        l.add(root.val);
        if (root.left != null) {
            addElements(root.left, l);
        }
        if (root.right != null) {
            addElements(root.right, l);
        }
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        addElements(root1, ans);
        addElements(root2, ans);
        Collections.sort(ans);
        return ans;
    }
}
