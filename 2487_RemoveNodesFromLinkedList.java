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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> s = new Stack<>();
        while (head != null) {
            s.push(head.val);
            head = head.next;
        }
        int max = 0;
        while (!s.empty()) {
            int val = s.pop();
            if (max <= val) {
                max = val;
                ListNode n = new ListNode(val);
                n.next = head;
                head = n; 
            } 
        }
        return head;
    }
}
