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
    public ListNode removeElements(ListNode head, int val) {
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode temp = helper;
        while (temp.next != null) {
            if (temp.next.val == val) {
                ListNode next = temp.next;
                temp.next = next.next;
            } else {
                temp = temp.next;
            }
        }
        return helper.next;
    }
}
