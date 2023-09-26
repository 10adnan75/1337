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
    public int computeGCD(int x, int y) {
        int gcd = 1;
        for (int i=2; i<=Math.min(x, y); i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode node = head;
        while (node.next != null) {
            ListNode newNode = new ListNode(computeGCD(node.val, node.next.val));
            ListNode temp = node.next;
            node.next = newNode;
            newNode.next = temp;
            node = node.next.next;
        }
        return head;
    }
}
