// My code
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {
            int currSum = 0;
            if (i+k <= nums.length) {
                for (int j=i; j<i+k; j++) {
                    currSum += nums[j];
                }
                maxSum = Math.max(maxSum, currSum);
            } else {
                break;
            }
        }
        return (double)maxSum/k;
    }
}
