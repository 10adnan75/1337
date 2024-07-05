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
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> nodes = new ArrayList<>(), criticalPoints = new ArrayList<>();
        while (head != null) {
            nodes.add(head.val);
            head = head.next;
        }
        for (int i=2; i<nodes.size(); i++) {
            int x = nodes.get(i-2), y = nodes.get(i-1), z = nodes.get(i);
            if (y > x && y > z) {
                criticalPoints.add(i);
            }
            if (y < x && y < z) {
                criticalPoints.add(i);
            }
        }
        int size = criticalPoints.size(), min = Integer.MAX_VALUE;
        int[] ans = new int[] {-1, -1};
        if (size < 2) {
            return ans;
        }
        for (int i=1; i<size; i++) {
            min = Math.min(min, criticalPoints.get(i)-criticalPoints.get(i-1));
        }
        ans[0] = min;
        ans[1] = criticalPoints.get(size-1) - criticalPoints.get(0);
        return ans;
    }
}
