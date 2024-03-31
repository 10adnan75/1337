class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long c = 0;
        int max = -1, min = -1, start = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > maxK || nums[i] < minK) {
                max = -1;
                min = -1;
                start = i+1;
                continue;
            }
            if (nums[i] == maxK) {
                max = i;
            }
            if (nums[i] == minK) {
                min = i;
            }
            c += Math.max(0L, Math.min(min, max)-start+1);
        }
        return c;
    }
}
