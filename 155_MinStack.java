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

// Aug 27, 2024
class MinStack {
    private MyStack stack;

    private static class MyStack {
        private long data;
        private long min;
        private MyStack next, prev;

        public MyStack() {
            this.data = 0;
            this.min = Integer.MAX_VALUE;
            this.next = null;
            this.prev = null;
        }
    }

    public MinStack() {
        this.stack = new MyStack();
    }

    public void push(int val) {
        if (this.stack.next == null && this.stack.prev == null) {
            this.stack.data = val;
            this.stack.min = val;
            this.stack.next = new MyStack();
            return;
        }
        MyStack newStack = this.stack.next;
        newStack.data = val;
        newStack.min = Math.min(this.stack.min, val);
        newStack.next = new MyStack();
        newStack.prev = this.stack;
        this.stack = newStack;
    }

    public void pop() {
        this.stack = (this.stack.prev == null) ? new MyStack() : this.stack.prev;
    }

    public int top() {
        return (int)this.stack.data;
    }

    public int getMin() {
        return (int)this.stack.min;
    }
}

// Somewhat optimized I guess
class MinStack {
    private MyStack stack;

    private static class MyStack {
        private final long data;
        private final long min;
        private final MyStack next, prev;

        public MyStack() {
            this.data = 0;
            this.min = Integer.MAX_VALUE;
            this.next = null;
            this.prev = null;
        }

        public MyStack(long data, long min, MyStack next, MyStack prev) {
            this.data = data;
            this.min = min;
            this.next = next;
            this.prev = prev;
        }
    }

    public MinStack() {
        this.stack = new MyStack();
    }

    public void push(int val) {
        this.stack = (this.stack.next == null && this.stack.prev == null) ? new MyStack(val, val, new MyStack(), null) : new MyStack(val, Math.min(this.stack.min, val), new MyStack(), this.stack);
    }

    public void pop() {
        this.stack = (this.stack.prev == null) ? new MyStack() : this.stack.prev;
    }

    public int top() {
        return (int)this.stack.data;
    }

    public int getMin() {
        return (int)this.stack.min;
    }
}
