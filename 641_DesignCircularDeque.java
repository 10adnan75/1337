class MyCircularDeque {
    private class ListNode {
        private ListNode next, prev;
        private int data;

        public ListNode() {
            this.data = 0;
            this.next = null;
            this.prev = null;
        }

        public ListNode(ListNode next, ListNode prev) {
            this.next = next;
            this.prev = prev;
        }
    }

    private ListNode dq, lo, hi;
    private int size, k;

    public MyCircularDeque(int k) {
        this.dq = new ListNode();
        this.lo = this.dq; this.hi = this.dq;
        this.k = k;
        this.size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull() || this.lo == null) {
            return false;
        }
        if (!isEmpty()) {
            this.lo.prev = new ListNode(this.lo, null);
            this.lo = this.lo.prev;
        }
        if (isEmpty()) {
            this.lo = this.hi = this.dq;
        }
        this.size++;
        this.lo.data = value;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull() || this.hi == null) {
            return false;
        }
        if (!isEmpty()) {
            this.hi.next = new ListNode(null, this.hi);
            this.hi = this.hi.next;
        }
        if (isEmpty()) {
            this.lo = this.hi = this.dq;
        }
        this.size++;
        this.hi.data = value;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty() || this.lo == null) {
            return false;
        }
        this.size--;
        this.lo = this.lo.next == null ? this.dq : this.lo.next;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty() || this.hi == null) {
            return false;
        }
        this.size--;
        this.hi = this.hi.prev == null ? this.dq : this.hi.prev;
        return true;
    }

    public int getFront() {
        return (this.lo == null || isEmpty()) ? -1 : this.lo.data;
    }

    public int getRear() {
        return (this.hi == null || isEmpty()) ? -1 : this.hi.data;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == this.k;
    }
}