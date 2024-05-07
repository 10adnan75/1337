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
    public ListNode doubleIt(ListNode head) {
        Stack<ListNode> s = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            s.push(temp);
            temp = temp.next;
        }
        int carry = 0;
        while (!s.empty()) {
            ListNode curr = s.pop();
            int doubled = curr.val * 2;
            curr.val = carry + (doubled % 10);
            carry = doubled / 10;
        }
        if (carry > 0) {
            ListNode newHead = new ListNode(carry);
            newHead.next = head;
            head = newHead;
        }
        return head;
    }
}
