class MyLinkedList {
    private Node head;
    private int size;
    
    private class Node {
        private int val;
        private Node next;
        
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if (index < size && index >= 0) {
            Node curr = head;
            while (index-- > 0) {
                curr = curr.next;
            }
            return curr.val;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            addAtHead(val);
        }
        Node dummy = new Node(-1);
        dummy.next = head;
        Node curr = dummy;
        while (index-- > 0) {
            curr = curr.next;
        }
        Node newNode = new Node(val);
        Node temp = curr.next;
        curr.next = newNode;
        newNode.next = temp;
        head = dummy.next;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < size && index >= 0) {
            Node dummy = new Node(0);
            dummy.next = head;
            Node curr = dummy;
            while (index-- > 0) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            head = dummy.next;
            size--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
