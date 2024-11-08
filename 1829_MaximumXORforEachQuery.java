class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length, xor = 0;
        int[] ans = new int[n];
        for (int i=0; i<n; i++) {
            xor ^= nums[i];
            ans[n-i-1] = xor ^ ((1 << maximumBit) - 1);
        }
        return ans;
    }
}
