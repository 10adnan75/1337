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
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        // Iteration - Runtime: 0 ms, Memory Usage: 38.5 MB
        /* ListNode ans = new ListNode(0);
        ListNode temp = ans;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                temp.next = l2;
                return ans.next;
            }
            if (l2 == null) {
                temp.next = l1;
                return ans.next;
            }
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        } 
        return ans.next; */
        
        // Recursion - Runtime: 0 ms, Memory Usage: 38.4 MB
        ListNode ans = null;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            ans = l1;
            ans.next = mergeTwoLists(l1.next, l2);
        } else {
            ans = l2;
            ans.next = mergeTwoLists(l1, l2.next);
        }
        return ans;
    }
}
