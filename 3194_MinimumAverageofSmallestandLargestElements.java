class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min = Double.MAX_VALUE;
        int lo = 0, hi = nums.length-1;
        while (lo <= hi) {
            min = Math.min(min, (nums[lo++]+nums[hi--])/2.0);
        }
        return min;
    }
}
