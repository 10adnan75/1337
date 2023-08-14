class Solution {
    
    public int findKthLargest(int[] nums, int k) {
        
        // Sorting - Runtime: 1 ms, Memory: 39.2 MB
        /* Arrays.sort(nums);
        return nums[nums.length-k]; */
        
        // Heap - Runtime: 4 ms, Memory: 39.2 MB
        PriorityQueue<Integer> q = new PriorityQueue<>(k);
        for (int i: nums) {
            q.offer(i);
            if (q.size() > k) {
                q.poll();
            }
        }
        return q.peek();
    }
}

// Counting Sort
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for (int num : nums) {
            mx = Math.max(mx, num);
            mn = Math.min(mn, num);
        }
        int[] freq = new int[mx - mn + 1];
        for (int num : nums) {
            freq[num - mn]++;
        }
        int idx = freq.length - 1;
        while (idx >= 0) {
            k -= freq[idx];
            if (k <= 0) {
                return idx + mn;
            }
            idx--;
        }
        return 0;
    }
}
