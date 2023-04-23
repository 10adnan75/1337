class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int maxTillNow = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                maxTillNow++;
            } else {
                maxTillNow = 0;
            }
            max = Math.max(max, maxTillNow);
        }
        return max;
    }
}
