class Solution {
    public long concatenate(int x, int y) {
        return Long.parseLong(x + "" + y);
    }

    public long findTheArrayConcVal(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        long ans = 0;
        while (lo <= hi) {
            if (lo == hi) {
                return ans + nums[lo];
            }
            ans += concatenate(nums[lo], nums[hi]);
            lo++; hi--;
        }
        return ans;
    }
}
