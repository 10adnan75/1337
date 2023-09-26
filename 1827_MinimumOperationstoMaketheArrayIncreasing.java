class Solution {
    public int minOperations(int[] nums) {
        int min = 0;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i+1] <= nums[i]) {
                min += (nums[i] - nums[i+1]) + 1;
                nums[i+1] = nums[i] + 1;
            }
        }
        return min;
    }
}
