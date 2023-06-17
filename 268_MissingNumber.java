// O(N) space
class Solution {
    public int missingNumber(int[] nums) {
        int[] x = new int[nums.length + 1];
        for (int i=0; i<nums.length; i++) {
            x[nums[i]] = -1;
        }
        for (int i=1; i<x.length; i++) {
            if (x[i] == 0) {
                return i;
            }
        }
        return 0;
    }
}

// O(1) space
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0, seriesSum = n * (n + 1) / 2;
        for (int i=0; i<n; i++) {
            sum += nums[i];
        }
        return seriesSum - sum;
    }
}
