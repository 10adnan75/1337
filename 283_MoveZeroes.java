class Solution {    
    public void moveZeroes(int[] nums) {
        int lo = 0, hi = 0;
        while (hi < nums.length) {
            if (nums[hi] != 0) {
                nums[lo++] = nums[hi];
            }
            hi++;
        }
        while (lo < nums.length) {
            nums[lo++] = 0;
        }
    }
}

// My code: auxiliary-space
class Solution {
    public void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i=0, idx=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                ans[idx++] = nums[i];
            }
        }
        for (int i=0; i<nums.length; i++) {
            nums[i] = ans[i];
        }
    }
}

// My code: in-place
class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZero++]= nums[i];
            }
        }
        for (int i=nonZero; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}
