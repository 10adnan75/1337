// Runtime error
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb = new StringBuilder();
        while (l1 != null) {
            sb.append(l1.val);
            l1 = l1.next;
        }
        int num = Integer.parseInt(sb.toString());
        sb.delete(0, sb.length());
        while (l2 != null) {
            sb.append(l2.val);
            l2 = l2.next;
        }
        num += Integer.parseInt(sb.toString());
        ListNode ans = new ListNode();
        if (num == 0) {
            return ans;
        }
        while (num != 0) {
            ListNode temp = new ListNode(num%10);
            temp.next = ans.next;
            ans.next = temp;
            num /= 10;
        }
        return ans.next;
    }
}

// Using stack
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
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        while(l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        int totalSum = 0, carry = 0;
        ListNode ans = new ListNode();
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) {
                totalSum += s1.pop();
            }
            if (!s2.empty()) {
                totalSum += s2.pop();
            }
            ans.val = totalSum % 10;
            carry = totalSum / 10;
            ListNode head = new ListNode(carry);
            head.next = ans;
            ans = head;
            totalSum = carry;
        }
        return carry == 0 ? ans.next: ans;
    }
}

