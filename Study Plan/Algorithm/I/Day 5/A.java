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
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        int i = length / 2 + 1;
        if (length % 2 == 1) {
           while (i-- > 0) {
                head = head.next;
            } 
        } else {
            while (i-- > 1) {
                head = head.next;
            }
        }
        return head;
    }
}
