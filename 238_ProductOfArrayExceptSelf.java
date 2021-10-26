class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        int left = 1, right = 1;
        for (int i=0; i<n; i++) {
            ans[i] *= left;
            left *= nums[i];
            ans[n-1-i] *= right;
            right *= nums[n-1-i];
        }
        return ans;
    }
}
