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
        ListNode head = createList(n);
        ListNode temp = head;
        while (n-- > 1) {
            
        }
        return 0;
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
        return head;
    }
}
