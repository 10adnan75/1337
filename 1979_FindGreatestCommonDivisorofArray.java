class Solution {
    public int findGCD(int[] nums) {
        int mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE;
        for (int i : nums) {
            mx = Math.max(mx, i);
            mn = Math.min(mn, i);
        }
        for (int i=mn; i>0; i--) {
            if (mn % i == 0 && mx % i == 0) {
                return i;
            }
        }
        return -1;
    }
}
