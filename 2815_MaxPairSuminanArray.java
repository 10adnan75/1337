class Solution {
    public int getMax(int n) {
        int max = Integer.MIN_VALUE;
        String s = String.valueOf(n);
        for (int i=0; i<s.length(); i++) {
            max = Math.max(max, (int)s.charAt(i));
        }
        return max;
    }

    public boolean checkMaxDigit(int i, int j) {
        return getMax(i) == getMax(j);
    }

    public int maxSum(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (checkMaxDigit(nums[i], nums[j])) {
                    ans = Math.max(ans, nums[i]+nums[j]);
                }
            }
        }
        return ans == Integer.MIN_VALUE ? -1 : ans;
    }
}
