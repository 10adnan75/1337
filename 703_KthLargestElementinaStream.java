class KthLargest {
    private PriorityQueue<Integer> pq;
    private int K;

    public KthLargest(int k, int[] nums) {
        this.K = k;
        pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i: nums) {
            this.pq.offer(i);
        }
    }
    
    public int add(int val) {
        this.pq.add(val);
        int n = this.pq.size(), max = 0, i = 1;
        PriorityQueue<Integer> newPQ = new PriorityQueue<>(Collections.reverseOrder());
        while (!this.pq.isEmpty() && n-- > 0) {
            if (i == this.K) {
                max = this.pq.poll();
                newPQ.offer(max);
                i++;
                continue;
            }
            newPQ.offer(this.pq.poll());
            i++;
        }
        this.pq = newPQ;
        return max;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
