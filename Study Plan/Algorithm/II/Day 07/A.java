/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Node l1 = root, l2 = root.left != null ? root.left : root.right;
        while (l1 == root || l2 != null) {
            Node p1 = l1, p2 = l2;
            while (p1 != null) {
                if (p1.left != null && p1.left != p2) {
                    p2.next = p1.left;
                    p2 = p2.next;
                }
                if (p1.right != null && p1.right != p2) {
                    p2.next = p1.right;
                    p2 = p2.next;
                }
                p1 = p1.next;
            }
            l1 = l2;
            l2 = nextHead(l2);
        }
        return root;
    }
    
    private Node nextHead(Node root) {
        while (root != null) {
            if (root.left != null) {
                return root.left;
            }
            if (root.right != null) {
                return root.right;
            }
            root = root.next;
        }
        return null;
    }
}
