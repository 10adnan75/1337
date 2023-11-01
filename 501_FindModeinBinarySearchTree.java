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
    public int[] findMode(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>() {{ add(root); }};
        int[] freq = new int[200001];
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            freq[curr.val+100000]++;
            if (curr.left != null) {
                q.offer(curr.left);
            }
            if (curr.right != null) {
                q.offer(curr.right);
            }
        }
        int mode = 0, c = 0;
        for (int m: freq) {
            mode = Math.max(mode, m);
        }
        for (int m: freq) {
            if (m == mode) {
                c++;
            }
        }
        int[] ans = new int[c];
        c = 0;
        for (int i=0; i<freq.length; i++) {
            if (freq[i] == mode) {
                ans[c++] = i-100000;
            }
        }
        return ans;
    }
}
