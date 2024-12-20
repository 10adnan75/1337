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
    private HashMap<Integer, Queue<Integer>> map = new HashMap<>();
    private TreeNode ans;

    public TreeNode reverseOddLevels(TreeNode root) {
        dfs(root, 0);
        for (Map.Entry<Integer, Queue<Integer>> e: map.entrySet()) {
            if ((e.getKey()&1) == 1) {
                Queue<Integer> q = e.getValue();
                reverse(q);
                map.put(e.getKey(), q);
            }
        }
        ans = new TreeNode(root.val);
        dfs2(ans, 1);
        return ans;
    }

    public void dfs2(TreeNode node, int level) {
        if (!map.containsKey(level)) {
            return;
        }
        node.left = new TreeNode(map.get(level).poll());
        node.right = new TreeNode(map.get(level).poll());
        if (node.left != null) dfs2(node.left, level+1);
        if (node.right != null) dfs2(node.right, level+1);
    }

    public void dfs(TreeNode node, int level) {
        mapLevel(node, level);
        if (node.left != null) dfs(node.left, level+1);
        if (node.right != null) dfs(node.right, level+1);
    }

    public void mapLevel(TreeNode node, int level) {
        if (node.left == null && node.right == null) {
            return;
        }
        Queue<Integer> l = new ArrayDeque<>();
        if (map.containsKey(level+1)) {
            l = map.get(level+1);
        }
        l.add(node.left.val);
        l.add(node.right.val);
        map.put(level+1, l);
    }

    public void reverse(Queue q) {
        Stack s = new Stack();
        while(!q.isEmpty()) { 
            s.push(q.poll());
        } 
        while(!s.isEmpty()) { 
            q.add(s.pop());
        }
    }
}
