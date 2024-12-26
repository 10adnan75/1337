// My code: bfs (2 ms)
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>(){{ add(root); }};
        while (!q.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int size = q.size();
            while (size-- > 0) {
                TreeNode node = q.poll();
                max = Math.max(max, node.val);
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            ans.add(max);
        }
        return ans;
    }
}

// Dec 25, 2024, US (2 ms)
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> largestValues(TreeNode root) {
        Map<Integer, List<Integer>> levels = new HashMap<>();

        dfs(root, 0, levels);

        return getMaxAtEachLevel(levels);
    }

    public void dfs(TreeNode root, int level, Map<Integer, List<Integer>> levels) {
        if (root == null) return;

        int val = root.val;

        if (levels.containsKey(level)) {
            levels.get(level).add(root.val);
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(val);
            levels.put(level, list);
        }

        dfs(root.left, level + 1, levels);
        dfs(root.right, level + 1, levels);
    }

    private List<Integer> getMaxAtEachLevel(Map<Integer, List<Integer>> levels) {
        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, List<Integer>> entry : levels.entrySet()) {
            List<Integer> level = entry.getValue();
            result.add(getMax(level));
        }

        return result;
    }

    private int getMax(List<Integer> level) {
        int max = level.getFirst();

        for (int i = 1; i < level.size(); i++) {
            max = Math.max(max, level.get(i));
        }

        return max;
    }
}

// Dec 25, 2024, US (1 ms)
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
    public List<Integer> largestValues(TreeNode root) {
        Map<Integer, Integer> maxAtEachLevel = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        dfs(root, 0, maxAtEachLevel);

        for (int i = 0; i < maxAtEachLevel.size(); i++) {
            result.add(maxAtEachLevel.get(i));
        }
        
        return result;
    }

    public void dfs(TreeNode root, int level, Map<Integer, Integer> maxAtEachLevel) {
        if (root == null) return;

        int val = root.val;
        int currVal = maxAtEachLevel.get(level) == null ? Integer.MIN_VALUE : maxAtEachLevel.get(level);
        
        maxAtEachLevel.put(level, Math.max(currVal, val));
        
        dfs(root.left, level + 1, maxAtEachLevel);
        dfs(root.right, level + 1, maxAtEachLevel);
    }
}
