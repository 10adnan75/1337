class Solution {    
    public void moveZeroes(int[] nums) {
        int lo = 0, hi = 0;
        while (hi < nums.length) {
            if (nums[hi] != 0) {
                nums[lo++] = nums[hi];
            }
            hi++;
        }
        while (lo < nums.length) {
            nums[lo++] = 0;
        }
    }
}
