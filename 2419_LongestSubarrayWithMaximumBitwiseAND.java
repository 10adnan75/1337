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

// Accepted
class Solution {
    public int longestSubarray(int[] nums) {
        int i = 1, c = 1, maxIdx = 0, max = nums[0], ans = 1;
        while (i < nums.length) {
            if (nums[i] > max) {
                ans = 1;
                c = 1;
                max = nums[i];
                maxIdx = i;
            } else if (nums[i-1] == nums[i] && i-1 == maxIdx) {
                c++;
                maxIdx = i;
                ans = Math.max(ans, c);
            } else if (nums[i] == max) {
                c = 1;
                maxIdx = i;
            }
            i++;
        }
        return ans;
    }
}