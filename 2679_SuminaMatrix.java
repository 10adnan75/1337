class Solution {
    public int matrixSum(int[][] nums) {
        for (int[] num : nums) {
            Arrays.sort(num);
        }
        int ans = 0;
        for (int i=0; i<nums[0].length; i++) {
            int max = 0;
            for (int j=0; j<nums.length; j++) {
                max = Math.max(max, nums[j][i]);
            }
            ans += max;
        }
        return ans;
    }
}
