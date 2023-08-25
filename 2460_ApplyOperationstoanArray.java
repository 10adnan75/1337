class Solution {
    public int[] applyOperations(int[] nums) {
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
                i++;
            }
        }
        int[] ans = new int[nums.length];
        int idx = 0;
        for (int i : nums) {
            if (i != 0) {
                ans[idx++] = i;
            }
        }
        return ans;
    }
}
