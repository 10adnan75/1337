class Solution {
    public boolean isFascinating(int n) {
        int[] nums = new int[10];
        String s = "" + n + (n * 2) + (n * 3);
        for (int i=0; i<s.length(); i++) {
            nums[s.charAt(i)-'0']++;
        }
        for (int i=1; i<nums.length; i++) {
            if (nums[i] != 1) {
                return false;
            }
        }
        return nums[0] > 0 ? false : true; 
    }
}
