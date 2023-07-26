class Solution {
    public int maximizeSum(int[] nums, int k) {
        int mx = Integer.MIN_VALUE;
        for (int num : nums) {
            mx = Math.max(mx, num);
        }
        int ans = 0;
        while (k-- > 0) {
            ans += mx++;
        }
        return ans;
    }
}
