class Solution {
    public int getMaximumGenerated(int n) {
        int[] nums = new int[n+1];
        int max = 0;
        if (n == 0) {
            return max;
        } else {
            nums[1] = 1;
            max = 1;
        }
        for (int i=2; i<=n; i++) {
            if ((i&1) == 1) {
                nums[i] = nums[i/2] + nums[i/2+1];
            } else {
                nums[i] = nums[i/2];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
