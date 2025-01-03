class Solution {
    public int waysToSplitArray(int[] nums) {
        int validWays = 0;
        int n = nums.length;
        long[] leftSum = new long[n];
        long[] rightSum = new long[n];

        leftSum[0] = nums[0];
        rightSum[n-1] = nums[n-1];

        for (int i=1, j=n-2; i<n-1 && j>0; i++, j--) {
            leftSum[i] = leftSum[i-1] + nums[i];
            rightSum[j] = rightSum[j+1] + nums[j];
        }       

        for (int i=1; i<n; i++) {
            if (rightSum[i] <= leftSum[i-1]) {
                validWays++;
            }
        }

        return validWays;
    }
}
