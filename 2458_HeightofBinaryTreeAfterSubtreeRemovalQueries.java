// TLE :(
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
    private Map<Integer, int[]> children = new HashMap<>();
    private Map<Integer, Integer> levels = new HashMap<>();

    public int[] treeQueries(TreeNode root, int[] queries) {
        int[] ans = new int[queries.length];
        dfs(root, 0, 0);
        int i = 0;
        for (int q: queries) {
            int currQLevel = children.get(q)[2], currQHeight = children.get(q)[3];
            if (levels.get(currQLevel) == currQHeight) {
                ans[i] = helper(q, currQLevel, currQHeight);
            } else {
                ans[i] = levels.get(0);
            }
            i++;
        }
        return ans;
    }

    public int helper(int q, int level, int height) {
        int max = -1;
        for (Map.Entry<Integer, int[]> e: children.entrySet()) {
            int key = e.getKey(), cL = e.getValue()[2], cH = e.getValue()[3];
            if (q != key && cL == level) {
                if (cH == height) {
                    return levels.get(0);
                }
                max = Math.max(cL + cH, max);
            }
        }
        return max == -1 ? levels.get(0) - height - 1 : max;
    }

    public int dfs(TreeNode node, int level, int height) {
        if (node == null) {
            return height;
        }
        int lVal = node.left == null ? 0 : node.left.val;
        int rVal = node.right == null ? 0 : node.right.val;
        int maxHeight = 1 + Math.max(dfs(node.left, level+1, height), dfs(node.right, level+1, height));
        if (levels.containsKey(level)) {
            levels.put(level, Math.max(levels.get(level), maxHeight-1));
        } else {
            levels.put(level, maxHeight-1);
        }
        children.put(node.val, new int[] {lVal, rVal, level, maxHeight-1});
        return maxHeight;
    }
}
