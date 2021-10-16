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
    
    /* private boolean dfs(TreeNode root, HashSet<Integer> set, int k) {
        if (root == null) {
            return false;
        }
        if (set.contains(k-root.val)) {
            return true;
        }
        set.add(root.val);
        return dfs(root.left, set, k) || dfs(root.right, set, k);
    } */
    
    /* private void inorder(TreeNode root, List<Integer> nums) {
        if (root == null) {
            return;
        }
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    } */
    
    private boolean dfs(TreeNode root, TreeNode curr, int k) {
        if (curr == null) {
            return false;
        }
        return search(root, curr, k-curr.val) || dfs(root, curr.left, k) || dfs(root, curr.right, k);
    }
    
    private boolean search(TreeNode root, TreeNode curr, int value) {
        if (root == null) {
            return false;
        }
        return (root.val == value) && (root != curr) || (root.val < value) && search(root.right, curr, value) || (root.val > value) && search(root.left, curr, value);
    }
    
    public boolean findTarget(TreeNode root, int k) {
        
        // HashTable - Runtime: 7 ms, Memory: 49.3 MB
        /* HashSet<Integer> set = new HashSet<>();
        return dfs(root, set, k); */
        
        // TwoPointer - Runtime: 8 ms, Memory: 49.2 MB
        /* List<Integer> nums = new ArrayList<>();
        inorder(root, nums);
        for (int i=0, j=nums.size()-1; i<j; ) {
            if (nums.get(i) + nums.get(j) == k) {
                return true;
            } else if (nums.get(i) + nums.get(j) < k) {
                i++;
            } else {
                j--;
            }
        }
        return false; */
        
        // BinarySearch - Runtime: 2 ms, Memory: 40.4 MB
        return dfs(root, root, k);
    }
}
