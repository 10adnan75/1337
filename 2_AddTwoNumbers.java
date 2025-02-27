/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 // Runtime: 4 ms, Memory: 44.9 MB
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
} */

// Runtime: 2 ms, Memory: 39.6 MB
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry != 0) {
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    }
}

// Brute force: not working for very long number!
// WA: overflow, -ve output
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
        Long num1 = convertListToLong(l1);
        Long num2 = convertListToLong(l2);

        long sum = num1 + num2;

        return sum == 0 ? new ListNode(0) : convertLongToList(sum);
    }

    public long convertListToLong(ListNode node) {
        long num = 0L;
        long power = 0;

        while (node != null) {
            num += Math.pow(10, power++) * node.val;
            node = node.next;
        }

        return num;
    }

    public ListNode convertLongToList(long num) {
        ListNode node = new ListNode();
        ListNode temp = node;

        while (num != 0) {
            int n = (int) (num % 10);
            temp.next = new ListNode(n);
            num = num / 10;
            temp = temp.next;
        }

        return node.next;
    }
}

// Accepted
// FEB 26, 2025, 7:00 PM, US
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
        ListNode sum = new ListNode();
        ListNode temp = sum;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int v1 = 0;
            int v2 = 0;

            if (l1 != null) {
                v1 = l1.val;
            }

            if (l2 != null) {
                v2 = l2.val;
            }

            int num = carry + v1 + v2;

            temp.next = new ListNode(num%10);
            carry = num / 10;
            temp = temp.next;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return sum.next;
    }
}
