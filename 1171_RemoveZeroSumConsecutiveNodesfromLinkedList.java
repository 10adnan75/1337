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
    public void makeArrayZero(int[] a, int i, int j) {
        for (int idx=i; idx<=j; idx++) {
            a[idx] = 0;
        }
    }

    public ListNode getLL(int[] a) {
        ListNode head = null;
        for (int i=a.length-1; i>=0; i--) {
            if (a[i] != 0) {
                ListNode newNode = new ListNode(a[i], head);
                head = newNode;
            }
        }
        return head;
    }

    public int[] prefixSum(int[] a) {
        for (int i=0; i<a.length; i++) {
            int sum = a[i];
            if (sum == 0) {
                continue;
            }
            for (int j=i+1; j<a.length; j++) {
                sum += a[j];
                if (sum == 0) {
                    makeArrayZero(a, i, j);
                }
            }
        }
        return a;
    }

    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int[] a = new int[size];
        size = 0;
        while (head != null) {
            a[size++] = head.val;
            head = head.next;
        }
        a = prefixSum(a);
        return getLL(a);
    }
}
