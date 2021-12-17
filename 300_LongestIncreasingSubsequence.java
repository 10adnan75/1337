class Solution {
    public int lengthOfLIS(int[] nums) {
        int size = nums.length;
        if (size <= 0) {
            return 0;
        }
        int[] result = new int[size];
        int max = 1;
        for (int i=0; i<nums.length; i++) {
            result[i] = 1;
            for (int j=0; j<i; j++) {
                if (nums[j] < nums[i]) {
                    result[i] = result[i] < result[j] + 1 ? result[j] + 1 : result[i];
                }
            }
            if (max < result[i]) {
                max = result[i];
            }
        }
        return max;
    }
}
