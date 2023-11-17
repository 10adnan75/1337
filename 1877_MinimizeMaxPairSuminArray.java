class Solution {
    public int minPairSum(int[] nums) {
        int max = 0, lo = 0, hi = nums.length-1;
        Arrays.sort(nums);
        while (lo < hi) {
            max = Math.max(max, nums[lo]+nums[hi]);
            lo++; hi--;
        }
        return max;
    }
}
