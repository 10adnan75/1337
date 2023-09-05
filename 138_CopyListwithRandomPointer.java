/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node getNode(int n,  Node node) {
        int i = 0;
        Node head = node;
        while (head != null) {
            if (i++ == n) {
                return head;
            }
            head = head.next;
        }
        return null;
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        int i = 0;
        Node x = head;
        Node ans = new Node(head.val);
        Node temp = ans;
        x = x.next;
        Map<Node, Integer> randoms = new HashMap<>();
        randoms.put(head, i++);
        while (x != null) {
            Node t = new Node(x.val);
            randoms.put(x, i++);
            temp.next = t;
            temp = t;
            x = x.next;
        }
        temp = ans;
        x = head;
        while (temp != null) {
            temp.random = (x.random == null) ? null : getNode(randoms.get(x.random), ans);
            temp = temp.next;
            x = x.next;
        }
        return ans;
    }
}

// Less memory
class Solution {
    public Node getNode(int n,  Node head) {
        int i = 0;
        while (head != null) {
            if (i++ == n) {
                return head;
            }
            head = head.next;
        }
        return head;
    }

    public Node copyRandomList(Node head) {
        int i = 0;
        Node ans = new Node(0);
        Node temp = ans, x = head;
        Map<Node, Integer> randoms = new HashMap<>();
        while (x != null) {
            randoms.put(x, i++);
            Node t = new Node(x.val);
            temp.next = t;
            temp = t;
            x = x.next;
        }
        temp = ans.next;
        while (temp != null) {
            temp.random = (head.random == null) ? null : getNode(randoms.get(head.random), ans.next);
            temp = temp.next;
            head = head.next;
        }
        return ans.next;
    }
}
