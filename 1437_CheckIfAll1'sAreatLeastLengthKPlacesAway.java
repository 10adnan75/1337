class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        boolean flag = false;
        int c = 0;
        for (int n: nums) {
            if (flag && n == 0) {
                c++;
            } else if (n == 1) {
                if (flag && c < k) {
                    return false;
                }
                flag = true;
                c = 0;
            }
        }
        return true;
    }
}
