class Solution {
    public boolean isArraySpecial(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        boolean f = (nums[0]&1) == 1 ? false : true;
        for (int i=1; i<nums.length; i++) {
            boolean t = (nums[i]&1) == 1 ? false : true;
            if (f == t) {
                return false;
            }
            f = t;
        }
        return true;
    }
}
