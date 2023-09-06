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
    public ListNode getLL(ListNode head, int start, int end) {
        ListNode ans = new ListNode();
        ListNode t = ans;
        for (int i=0; i<start+end; i++) {
            if (i >= start) {
                ListNode tmp = new ListNode(head.val);
                t.next = tmp;
                t = tmp;
            }
            head = head.next;
        }
        return ans.next;
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        int N = 0;
        ListNode t = head;
        while (t != null) {
            N++;
            t = t.next;
        }
        ListNode[] ans = new ListNode[k];
        if ((N/k) == 0) {
            t = head;
            for (int i=0; i<k && t!=null; i++) {
                ans[i] = (i < (N%k)) ? new ListNode(t.val) : null;
                t = t.next;
            }
        } else {
            int start = 0, parts = N/k;
            for (int i=0; i<k; i++) {
                if (i < (N%k)) {
                    ans[i] = getLL(head, start, parts+1);
                    start += (parts+1);
                } else {
                    ans[i] = getLL(head, start, parts);
                    start += parts;
                }
            }
        }
        return ans;
    }
}
