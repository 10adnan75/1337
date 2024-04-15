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
    private List<String> l = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        int sum = 0;
        dfs(root, new char[10], 0);
        for (String s: l) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    public void dfs(TreeNode node, char[] arr, int i) {
        if (node == null) {
            return;
        }
        arr[i++] = (char)(node.val+'0');
        if (node.left == null && node.right == null) {
            l.add(getSum(arr, i));
            return;
        }
        dfs(node.left, arr, i);
        dfs(node.right, arr, i);
    }

    public String getSum(char[] arr, int size) {
        String sum = "";
        for (int i=0; i<size; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
