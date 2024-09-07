/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    private List<List<Integer>> paths = new ArrayList<>();

    public boolean isSubPath(ListNode head, TreeNode root) {
        dfs(root, new ArrayList<>());
        return helper(convertLL(head));
    }

    public List<Integer> convertLL(ListNode node) {
        List<Integer> l = new ArrayList<>();
        while (node != null) {
            l.add(node.val);
            node = node.next;
        }
        return l;
    }

    public boolean helper(List<Integer> l) {
        for (List<Integer> p: this.paths) {
            if (Collections.indexOfSubList(p, l) != -1) {
                return true;
            }
        }
        return false;
    }

    public void dfs(TreeNode node, List<Integer> l) {
        if (node == null) {
            this.paths.add(l);
            return;
        }
        l.add(node.val);
        dfs(node.left, new ArrayList<>(l));
        dfs(node.right, l);
    }
}
