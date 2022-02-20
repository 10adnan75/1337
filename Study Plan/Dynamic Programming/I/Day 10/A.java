class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int sum = 0;
        boolean[][] dp = new boolean[nums.length][nums.length];
        for (int i=0; i+3<=nums.length; i++) {
            dp[i][i+2] = nums[i]-nums[i+1] == nums[i+1]-nums[i+2];
            sum += (dp[i][i+2] == true) ? 1 : 0;
        }
        for (int l=4; l<=nums.length; l++) {
            for (int i=0; i+l<=nums.length; i++) {
                dp[i][i+l-1] = dp[i][i+l-2] && nums[i]-nums[i+1] == nums[i+l-2]-nums[i+l-1];
                sum += (dp[i][i+l-1] == true) ? 1 : 0;
            }
        }
        return sum;
    }
}
