/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    private List<Integer> postOrder = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        dfs(root);
        return this.postOrder;
    }

    public void dfs(Node node) {
        if (node == null) {
            return;
        }
        for (Node n: node.children) {
            dfs(n);
        }
        this.postOrder.add(node.val);
    }
}
