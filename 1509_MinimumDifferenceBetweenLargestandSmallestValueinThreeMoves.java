class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length, ans = Integer.MAX_VALUE;
        if (n < 5) {
            return 0;
        }
        Arrays.sort(nums);
        for (int i=0, j=4; i<4; i++, j--) {
            ans = Math.min(ans, helper(nums, i, n-j));
        }
        return ans;
    }

    public int helper(int[] nums, int start, int end) {
        return nums[end] - nums[start];
    }
}
