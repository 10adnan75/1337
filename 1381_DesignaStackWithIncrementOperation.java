class CustomStack {
    private final int[] stack;
    private int i;

    public CustomStack(int maxSize) {
        this.stack = new int[maxSize];
        this.i = 0;
    }

    public void push(int x) {
        if (this.i < this.stack.length) {
            this.stack[this.i++] = x;
        }
    }

    public int pop() {
        if (this.i == 0 && this.stack[this.i] == 0) {
            return -1;
        }
        int pop = this.stack[--this.i];
        this.stack[this.i] = 0;
        return pop;
    }

    public void increment(int k, int val) {
        k = Math.min(k, this.i);
        for (int i=0; i<k; i++) {
            this.stack[i] += val;
        }
    }
}