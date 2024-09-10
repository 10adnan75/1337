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

// Sep 9, 2024
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            ListNode curr = temp, node = temp.next;
            temp = new ListNode(gcd(temp.val, temp.next.val));
            curr.next = temp;
            temp.next = node;
            temp = temp.next;
        }
        return head;
    }

    public int gcd(int a, int b) {
        int min = Math.min(a, b);
        while (min != 0) {
            if (a % min == 0 && b % min == 0) {
                break;
            }
            min--;
        }
        return min;
    }
}
