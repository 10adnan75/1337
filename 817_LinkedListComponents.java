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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        int components = 0;
        boolean flag = true;
        while (head != null && !set.contains(head.val)) {
            head = head.next;
        }
        while (head != null) {
            if (!set.contains(head.val)) {
                if (flag) {
                    components++;
                }
                flag = false;
            } else {
                flag = true;
            }
            head = head.next;
        }
        return flag ? components+1 : components;
    }
}
