class Solution {
    public int findNonMinOrMax(int[] nums) {
        int ans = -1;
        if (nums.length < 3) {
            return ans;
        }
        int mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE;
        for (int num : nums) {
            mx = Math.max(mx, num);
            mn = Math.min(mn, num);
        }
        for (int num : nums) {
            if (num != mx && num != mn) {
                ans = num;
                break;
            }
        }
        return ans;
    }
}
