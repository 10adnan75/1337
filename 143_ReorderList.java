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
    
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode n = reverse(slow.next);
        slow.next = null;
        ListNode m = head;
        while (m != null && n != null) {
            ListNode tempM = m.next;
            ListNode tempN = n.next;
            m.next = n;
            n.next = tempM;
            m = tempM;
            n = tempN;
        }
    }
    
    public ListNode reverse(ListNode start) {
        if (start == null || start.next == null) {
            return start;
        }
        ListNode m = start, n = start.next;
        start.next = null;
        while (m != null && n != null) {
            ListNode temp = n.next;
            n.next = m;
            m = n;
            n = temp;
        }
        return m;
    }
}
