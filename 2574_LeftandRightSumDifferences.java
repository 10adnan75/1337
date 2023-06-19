// Tyro approach
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return new int[n];
        }
        int[] answer = new int[n];
        for (int i=0; i<n; i++) {
            int leftSum = 0, rightSum = 0;
            int lo = 0, hi = n - 1;
            while (lo < i) {
                leftSum += nums[lo++];
            }
            while (hi > i) {
                rightSum += nums[hi--];
            }
            answer[i] = Math.abs(leftSum - rightSum);
        }
        return answer;
    }
}

// Efficacious approach
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        for (int i=1, j=nums.length-2; i<nums.length && j>=0; i++, j--) {
            leftSum[i] = nums[i-1] + leftSum[i-1];
            rightSum[j] = nums[j+1] + rightSum[j+1];
        }
        for(int i=0; i<nums.length; i++) {
            rightSum[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return rightSum;
    }
}
