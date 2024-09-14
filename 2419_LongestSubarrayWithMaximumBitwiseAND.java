// TLE
class Solution {
    public int longestSubarray(int[] nums) {
        int c = 0, max = 0;
        for (int i=0; i<nums.length; i++) {
            int and = nums[i];
            for (int j=i; j<nums.length; j++) {
                and &= nums[j];
                if (and > max || (j-i+1 > c && and == max)) {
                    max = and;
                    c = j-i+1;
                }
            }
        }
        return c;
    }
}