class Solution {
    public int dominantIndex(int[] nums) {
        int idx = -1;
        int mx = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > mx) {
                mx = nums[i];
                idx = i;
            }
        }
        for (int i=0; i<nums.length; i++) {
            if (i == idx) {
                continue;
            }
            if (2 * nums[i] > mx) {
                return -1;
            }
        }
        return idx;
    }
}
