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

// My code (Brute force)
// Feb 25, 2026, 4:30 PM, US
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while (list1 != null) {
            pq.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            pq.add(list2.val);
            list2 = list2.next;
        }

        ListNode ans = new ListNode(pq.poll());
        ListNode temp = ans;
        while (!pq.isEmpty()) {
            temp.next = new ListNode(pq.poll());
            temp = temp.next;
        }

        return ans;
    }
}

// Still my code
// FEB 25, 2026, 4:42 PM, US
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode temp = ans;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        }

        if (list2 != null) {
            temp.next = list2;
        }

        return ans.next;
    }
}
