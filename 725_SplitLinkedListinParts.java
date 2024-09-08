// Sep 6, 2023 (India)
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

// Sep 7, 2024 (USA)
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
    private ListNode myNode;
    private int[] vals;
    private int id;

    public ListNode[] splitListToParts(ListNode head, int k) {
        this.myNode = head;
        int size = getSize();
        makeArray(size);
        this.id = 0;
        return size <= k ? getList(1, 1, k, true) : getList(size%k, size/k, k, false);
    }

    public ListNode[] getList(int firstPart, int n, int k, boolean f) {
        ListNode[] parts = new ListNode[k];
        int i = 0;
        for ( ; i<firstPart; i++) {
            parts[i] = f ? getLL(n) : getLL(n+1);
        }
        for ( ; i<k; i++) {
            parts[i] = getLL(n);
        }
        return parts;
    }

    public ListNode getLL(int n) {
        if (this.id >= this.vals.length) {
            return null;
        }
        ListNode LL = new ListNode(this.vals[this.id++]);
        n--;
        ListNode temp = LL;
        while (this.id < this.vals.length && n-- > 0) {
            ListNode node = new ListNode(this.vals[this.id++]);
            temp.next = node;
            temp = node;
        }
        return LL;
    }

    public int getSize() {
        int size = 0;
        ListNode temp = this.myNode;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public void makeArray(int n) {
        this.vals = new int[n];
        ListNode temp = this.myNode;
        int i = 0;
        while (temp != null) {
            vals[i++] = temp.val;
            temp = temp.next;
        }
    }
}
