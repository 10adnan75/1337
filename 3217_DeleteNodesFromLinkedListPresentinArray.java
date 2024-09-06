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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode modifiedLL = new ListNode();
        Set<Integer> set = new HashSet<>();
        for (int n: nums) {
            set.add(n);
        }
        boolean f = false;
        ListNode temp = modifiedLL;
        while (head != null) {
            if (!set.contains(head.val)) {
                if (!f) {
                    modifiedLL.val = head.val;
                    f = !f;
                    head = head.next;
                    continue;
                }
                ListNode node = temp;
                temp = new ListNode(head.val);
                node.next = temp;
            }
            head = head.next;
        }
        return modifiedLL;
    }
}

// in-place
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int n: nums) {
            set.add(n);
        }
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            while (temp != null && temp.next != null && set.contains(temp.next.val)) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        while (head != null) {
            if (set.contains(head.val)) {
                head = head.next;
                continue;
            }
            break;
        }
        return head;
    }
}
