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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans, tOne = l1, tTwo = l2;;
        
        int carry = 0;
        while (tOne!=null | tTwo!=null) {
            int add = carry;
            
            if (tOne != null) {
                add += tOne.val;
                tOne = tOne.next;
            }
            
            if (tTwo != null) {
                add += tTwo.val;
                tTwo = tTwo.next;
            }
            
            if (add > 9) {
                carry = 1;
                add -= 10;
            } else {
                carry = 0;
            }
            
            ListNode l = new ListNode(add);
            temp.next = l;
            temp = temp.next;
        }
        
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }
        
        return ans.next;
    }
}
