class MyCircularQueue {
    private int front, rear, size;
    private final int[] arr;

    public MyCircularQueue(int k) {
        this.arr = new int[k];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public boolean enQueue(int value) {
        if (!isFull()) {
            if (this.front == -1) {
                this.front++;
            }
            this.arr[(++this.rear)%(this.arr.length)] = value;
            this.size++;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if (!isEmpty()) {
            if (this.front == this.arr.length) {
                this.front = 0;
            }
            this.arr[this.front++] = -1;
            this.size--;
            return true;
        }
        return false;
    }

    public int Front() {
        return isEmpty() ? -1 : this.arr[this.front % (this.arr.length)];
    }

    public int Rear() {
        return isEmpty() ? -1 : this.arr[this.rear % (this.arr.length)];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == this.arr.length;
    }
}
