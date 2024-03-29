// Brute Force: TLE :(
class Solution {
    public long countSubarrays(int[] nums, int k) {
        long c = 0;
        int max = 0;
        for (int num: nums) {
            max = Math.max(max, num);
        }
        for (int i=0; i<nums.length; i++) {
            int j = i, maxC = 0;
            while (j < nums.length) {
                if (nums[j] == max) {
                    maxC++;
                }
                if (maxC >= k) {
                    c++;
                }
                j++;
            }
        }
        return c;
    }
}

// Sliding Window: Accepted :)
