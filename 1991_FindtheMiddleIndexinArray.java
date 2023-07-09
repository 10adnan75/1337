// Array
class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for (int i=1, j=nums.length-2; i<nums.length && j>=0; i++, j--) {
            left[i] = left[i-1] + nums[i-1];
            right[j] = right[j+1] + nums[j+1];
        }
        for (int idx=0; idx<nums.length; idx++) {
            if (left[idx] == right[idx]) {
                return idx;
            }
        }
        return -1;
    }
}

// Prefix Sum
class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        for (int i : nums) {
            sum += i;
        }
        for (int i=0; i<nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
