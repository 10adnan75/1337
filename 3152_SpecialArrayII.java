class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
        int i = 0;
        for (int[] q: queries) {
            if (check(nums, q[0], q[1])) {
                ans[i] = true;
            }
            i++;
        }
        return ans;
    }

    public boolean check(int[] nums, int start, int end) {
        boolean x = (nums[start]&1) == 1 ? false : true;
        for (int i=start+1; i<=end; i++) {
            if (x && (nums[i]&1) == 0) {
                return false;
            }
            if (!x && (nums[i]&1) == 1) {
                return false;
            }
            x = !x;
        }
        return true;
    }
}
