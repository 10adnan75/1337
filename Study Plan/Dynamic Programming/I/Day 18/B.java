class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int endWithValley = 1;
        int endWithPeak = 1;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                endWithPeak = endWithValley + 1;
            } else if (nums[i] < nums[i-1]) {
                endWithValley = endWithPeak + 1;
            }
        }
        return Math.max(endWithValley, endWithPeak);
    }
}
