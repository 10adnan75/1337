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
