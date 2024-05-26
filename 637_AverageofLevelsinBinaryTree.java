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
    private Map<Integer, List<Integer>> map = new HashMap<>();
    
    public List<Double> averageOfLevels(TreeNode root) {
        dfs(root, 0);
        List<Double> avg = new ArrayList<>();
        for (Map.Entry e: map.entrySet()) {
            avg.add(getAverage((List<Integer>)e.getValue()));
        }
        return avg;
    }

    public void dfs(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        List<Integer> l = new ArrayList<>();
        if (map.containsKey(level)) {
            l = map.get(level);
        }
        l.add(root.val);
        map.put(level, l);
        dfs(root.left, level+1);
        dfs(root.right, level+1);
    }

    public double getAverage(List<Integer> l) {
        double sum = 0.0;
        for (int i: l) {
            sum += i;
        }
        return sum / l.size();
    }
}
