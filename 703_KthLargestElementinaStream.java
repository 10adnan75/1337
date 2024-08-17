// TLE :)
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

// Accepted :)
class KthLargest {
    private PriorityQueue<Integer> pq;
    private int K;

    public KthLargest(int k, int[] nums) {
        this.pq = new PriorityQueue<>();
        this.K = k;
        Arrays.sort(nums);
        int i = 0, n = nums.length - 1;
        while (n >= 0) {
            if (i++ == k) {
                break;
            }
            this.pq.offer(nums[n--]);
        }
    }
    
    public int add(int val) {
        if (this.pq.isEmpty()) {
            this.pq.offer(val);
            return val;
        }
        if (this.pq.size() < this.K) {
            this.pq.offer(val);
            int k = this.pq.poll();
            this.pq.offer(k);
            return k;
        }
        int k = this.pq.poll();
        if (val <= k) {
            this.pq.offer(k);
            return k;
        }
        this.pq.offer(val);
        k = this.pq.poll();
        this.pq.offer(k);
        return k;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
