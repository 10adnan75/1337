// Math
class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int x = -1, y = -1;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                x = i;
            }
            if (nums[i] == nums.length) {
                y = i;
            }
        }
        return x > y ? x - 1 + (nums.length - y - 1) : x + (nums.length - y - 1);
    }
}

// Brute force
class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int c = 0;
        for (int i=nums.length-1; i>0; i--) {
            if (nums[i] == 1) {
                nums[i] = nums[i-1];
                nums[i-1] = 1;
                c++;
            }
        }
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] == nums.length) {
                nums[i] = nums[i+1];
                nums[i+1] = nums.length;
                c++;
            }
        }
        return c;
    }
}
