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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        List<Integer> l = new ArrayList<>();
        while (head != null) {
            l.add(head.val);
            head = head.next;
        }
        int[] a = new int[l.size()];
        int x = 0;
        for (int i : l) {
            a[x++] = i;
        }
        Arrays.sort(a);
        ListNode ans = new ListNode(a[a.length-1]);
        for (x=a.length-2; x>=0; x--) {
            ListNode temp = ans;
            ListNode t = new ListNode(a[x]);
            t.next = temp;
            ans = t;
        }
        return ans;
    }
}
