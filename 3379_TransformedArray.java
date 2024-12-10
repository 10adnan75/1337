class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i=0; i<n; i++) {
            int x = nums[i] == 0 ? 0 : nums[i] > 0 ? 1 : -1;
            result[i] = helper(nums, Math.abs(nums[i]), x, i, n);
        }
        return result;
    }

    public int helper(int[] nums, int value, int sign, int index, int n) {
        if (sign == 0) {
            return value;
        } else if (sign > 0) {
            return nums[(index+value)%n];
        }
        return nums[(index+(n-(value%n)))%n];
    }
}
