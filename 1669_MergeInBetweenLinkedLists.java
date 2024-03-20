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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int ptr = 0;
        ListNode temp = list1, l1 = null, l2 = null;
        while (temp != null) {
            ptr++;
            if (ptr == a) {
                l1 = temp;
            }
            if (ptr == b+1) {
                l2 = temp.next;
            }
            temp = temp.next;
        }
        l1.next = list2;
        temp = list2;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = l2;
        return list1;
    }
}
