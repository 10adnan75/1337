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

// my code
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
        if (head.next == null) {
            return;
        }
        ListNode slow = head, fast = head;
        while (slow != null && fast != null) {
            if (fast.next == null) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        Queue<ListNode> queue = new LinkedList<>();
        Stack<ListNode> stack = new Stack<>();
        fast = head.next;
        while (fast != null && fast != slow) {
            queue.offer(fast);
            fast = fast.next;
        }
        while (slow != null) {
            stack.push(slow);
            slow = slow.next;
        }
        ListNode temp = head;
        while (!(queue.isEmpty() || stack.isEmpty())) {
            slow = stack.pop(); slow.next = null;
            fast = queue.poll(); fast.next = null;
            temp.next = slow;
            temp.next.next = fast;
            temp = temp.next.next;
        }
        while (!stack.empty()) {
            slow = stack.pop(); slow.next = null;
            temp.next = slow;
            temp = temp.next;
        }
    }
}
