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
