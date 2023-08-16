class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            if (nums[lo] > 0) {
                return -1;
            } else if (Math.abs(nums[lo]) == nums[hi]) {
                return nums[hi];
            } else if (Math.abs(nums[lo]) < nums[hi]) {
                hi--;
            } else {
                lo++;
            }
        }
        return -1;
    }
}
