class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i=0; i<nums.length; i++) {
            if (max >= nums.length-1 || i > max) {
                break;
            }
            max = Math.max(i+nums[i], max);
        }
        return max >= nums.length-1 ? true : false;
    }
}
