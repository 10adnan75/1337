class Solution {
    
    private int divideAndConquer(int lo, int hi, int[] nums) {
        if (lo == hi) {
            return nums[lo];
        }
        int left = Integer.MIN_VALUE, right = Integer.MIN_VALUE;
        int mid = lo + (hi-lo)/2;
        int curr = 0;
        for (int i=mid+1; i<=hi; i++) {
            curr += nums[i];
            right = Math.max(right, curr);
        }
        curr = 0;
        for (int i=mid; i>=lo; i--) {
            curr += nums[i];
            left = Math.max(left, curr);
        }
        int total = left + right;
        int leftSum = divideAndConquer(lo, mid, nums);
        int rightSum = divideAndConquer(mid+1, hi, nums);
        return Math.max(total, Math.max(leftSum, rightSum));
    }
    
    public int maxSubArray(int[] nums) {
        
        // O(n^2) - TLE
        
        // O(n) Kadane's Algorithm - Runtime: 1 ms, Memory: 38.4 MB
        /* int maxSoFar = nums[0], currMax = nums[0];
        for (int i=1; i<nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar; */
        
        // O(nlgn) Divide and Conquer - Runtime: 12 ms, Memory: 49 MB
        return divideAndConquer(0, nums.length-1, nums);
    }
}
