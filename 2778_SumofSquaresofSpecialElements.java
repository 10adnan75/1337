class Solution {
    public int sumOfSquares(int[] nums) {
        int c = 0, n = nums.length;
        for (int i=0; i<n; i++) {
            if (n % (i+1) == 0) {
                c += (nums[i] * nums[i]);
            }
        }
        return c;
    }
}
