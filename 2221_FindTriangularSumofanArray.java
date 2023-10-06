// Auxiliary array
class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        int[] cache = nums;
        while (n-- > 1) {
            for (int i=0; i<n; i++) {
                cache[i] = (nums[i] + nums[i+1]) % 10;
            }
        }
        return cache[0];
    }
}

// Without an extra array
class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        while (n-- > 1) {
            for (int i=0; i<n; i++) {
                nums[i] = (nums[i] + nums[i+1]) % 10;
            }
        }
        return nums[0];
    }
}
