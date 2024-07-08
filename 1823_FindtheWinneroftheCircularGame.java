class Solution {
    
    public int findTheWinner(int n, int k) {
        return 1 + helper(n, k);
    }
    
    private int helper(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (helper(n-1, k) + k) % n;
    }
}

// My code
class ListNode {
    public int data;
    public ListNode next;

    public ListNode() {}

    public ListNode(int n) {
        this.data = n;
    } 

    public ListNode(int n, ListNode next) {
        this.data = n;
        this.next = next;
    } 
}

class Solution {
    public int findTheWinner(int n, int k) {
        if (k == 1) {
            return n;
        }
        ListNode head = createList(n);
        ListNode temp = head;
        while (n-- > 0) {
            int c = k;
            while (c-- > 2) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return temp.data;
    }

    public ListNode createList(int n) {
        ListNode head = new ListNode();
        int i = 1;
        ListNode temp = head;
        while (i < n) {
            temp.data = i++;
            ListNode newNode = new ListNode();
            temp.next = newNode;
            temp = newNode;
        }
        temp.data = n;
        temp.next = head;
        return head;
    }
}
