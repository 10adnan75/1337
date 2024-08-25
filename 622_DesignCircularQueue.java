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
            if (front == -1) {
                front++;
            }
            arr[(++rear)%(arr.length)] = value;
            size++;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if (!isEmpty()) {
            if (front == arr.length) {
                front = 0;
            }
            arr[front++] = -1;
            size--;
            return true;
        }
        return false;
    }

    public int Front() {
        return isEmpty() ? -1 : arr[front % (arr.length)];
    }

    public int Rear() {
        return isEmpty() ? -1 : arr[rear % (arr.length)];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }
}
