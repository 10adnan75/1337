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
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preLen = preorder.length, inLen = inorder.length;
        return buildTree(preorder, 0, preLen-1, inorder, 0, inLen-1);
    }
    
    private TreeNode buildTree(int[] pre, int preLo, int preHi, int[] in, int inLo, int inHi) {
        if (inHi < inLo || preHi < preLo) {
            return null;
        }
        int root = pre[preLo], idx = 0;
        for (int i=inLo; i<=inHi; i++) {
            if (in[i] == root) {
                idx = i;
                break;
            }
        }
        int len = idx - inLo;
        TreeNode ans = new TreeNode(root);
        ans.left = buildTree(pre, preLo+1, preLo+len, in, inLo, idx-1);
        ans.right = buildTree(pre, preLo+len+1, preHi, in, idx+1, inHi);
        return ans;
    }
}
