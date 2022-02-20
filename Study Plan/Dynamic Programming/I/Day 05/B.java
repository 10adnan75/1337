class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = 0;
        int minSum = Integer.MAX_VALUE, currSum1 = 0;
        int maxSum = Integer.MIN_VALUE, currSum2 = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            currSum1 = currSum1 > 0 ? nums[i] : currSum1 + nums[i];
            minSum = Math.min(minSum, currSum1);
            currSum2 = currSum2 < 0 ? nums[i] : currSum2 + nums[i];
            maxSum = Math.max(maxSum, currSum2);
        }
        if(maxSum < 0) {
            return maxSum;
        }
        return Math.max(maxSum, sum - minSum);
    }
}
