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

// Time efficient
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i=0; i<k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i=k; i<nums.length; i++) {
            sum += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum/k;
    }
}

// Oct 26, 2024
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowAvg = 0.0;
        for (int i=0; i<k; i++) {
            windowAvg += nums[i];
        }
        double maxAvg = windowAvg;
        for (int i=1; i<=nums.length-k; i++) {
            windowAvg += (nums[k+i-1] - nums[i-1]);
            maxAvg = Math.max(maxAvg, windowAvg);
        }
        return maxAvg / k;
    }
}
