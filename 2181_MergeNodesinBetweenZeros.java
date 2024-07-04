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
    public ListNode mergeNodes(ListNode head) {
        head = head.next;
        ListNode ans = new ListNode(), temp = new ListNode();
        ans.next = temp;
        int sum = 0;
        while (head != null) {
            if (head.val == 0) {
                ListNode newNode = temp;
                if (head.next != null) {
                    temp = new ListNode();
                    newNode.next = temp;
                }
                newNode.val = sum;
                sum = 0;
            } else {
                sum += head.val;
            }
            head = head.next;
        }
        return ans.next;
    }
}
