class Solution {
    public int findFinalValue(int[] nums, int original) {
        for (int i=0; i<nums.length; i++) {
            if (original == nums[i]) {
                original = findFinalValue(nums, original * 2);
            }
            if (i == nums.length - 1) {
                return original;
            }
        }
        return 0;
    }
}
