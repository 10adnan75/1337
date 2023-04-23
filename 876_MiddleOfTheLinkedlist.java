/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 **/

// Memory: 36.5 MB
class Solution {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        int i = length / 2 + 1;
        if (length % 2 == 1) {
           while (i-- > 0) {
                head = head.next;
            } 
        } else {
            while (i-- > 1) {
                head = head.next;
            }
        }
        return head;
    }
}

// Memory: 39.9 MB
class Solution {
    public ListNode middleNode(ListNode head) {
        int lenOfList = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            lenOfList++;
        }
        lenOfList /= 2;
        while (lenOfList > 0) {
            head = head.next;
            lenOfList--;
        }
        return head;
    }
}

// Memory: 40 MB
class Solution {
    public ListNode middleNode(ListNode head) {
        int lenOfList = 0;
        ListNode temp = head;
        while (temp.next != null) {
            lenOfList++;
            temp = temp.next;
        }
        temp = head;
        if ((lenOfList & 1) == 1) {
            lenOfList = lenOfList / 2 + 1;
        } else {
            lenOfList = lenOfList / 2;
        }
        int middle = 0;
        while (temp.next != null) {
            if (middle == lenOfList) {
                return temp;
            }
            temp = temp.next;
            middle++;
        }
        return temp;
    }
}

// Memory: 40.2 MB
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode last = head;
        while (last != null && last.next != null) {
            head = head.next;
            last = last.next.next;
        }
        return head;
    }
}
