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
    public ListNode reverseList(ListNode head) {
        
        // Using aux array - Runtime: 0 ms, Memory Usage: 38.3 MB
        /* int[] a = new int[5001];
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            a[size++] = temp.val;
            temp = temp.next;
        }
        temp = head;
        for (int i=size-1; i>=0; i--) {
            temp.val = a[i];
            temp = temp.next;
        }
        return head; */
        
        // Recursion / Backtracking - Runtime: 0 ms, Memory Usage: 39 MB
        if (head == null || head.next == null) {
            return head;
        }
        ListNode rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
}

// my code
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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        List<Integer> l = new ArrayList<>();
        while (head != null) {
            l.add(head.val);
            head = head.next;
        }
        int i = 0;
        head = new ListNode(l.get(i++)); // trivial code (the program still works even if it is omitted) 
        while (i < l.size()) {
            ListNode newNode = new ListNode(l.get(i++), head);
            head = newNode;
        }
        return head;
    }
}
