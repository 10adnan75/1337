class MinStack {
    Node head;

    private class Node {
        public int data, min;
        public Node next;
        
        public Node(int val, int min) {
            this.data = val;
            this.min = min;
            this.next = null;
        }
    }
    
    public MinStack() {
        this.head = null;
    }
    
    public void push(int val) {
        if (head == null) {
            head = new Node(val, val);
            return;
        }
        Node newNode = new Node(val, Math.min(val, head.min));
        newNode.next = head;
        head = newNode;
    }
    
    public void pop() {
        if (head == null) {
            return;
        }
        Node newHead = head.next;
        head.next = null;
        head = newHead;
    }
    
    public int top() {
        if (head == null) {
            return -1;
        }
        return head.data;
    }
    
    public int getMin() {
        if (head == null) {
            return -1;
        }
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
