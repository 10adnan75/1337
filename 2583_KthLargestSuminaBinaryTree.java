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
    public long kthLargestLevelSum(TreeNode root, int k) {
        long[] level = new long[10000000];
        dfs(root, 0, level);
        List<Long> ans = new ArrayList<>();
        for (long l: level) {
            if (l != 0) {
                ans.add(l);
            }
        }
        Collections.sort(ans, Collections.reverseOrder());
        return k > ans.size() ? -1 : ans.get(k-1);
    }

    public void dfs(TreeNode node, int l, long[] level) {
        level[l] += node.val;
        if (node.right != null) {
            dfs(node.right, l+1, level);
        }
        if (node.left != null) {
            dfs(node.left, l+1, level);
        }
    }
}
