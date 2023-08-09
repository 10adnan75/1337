class Solution {
    public int minimumOperations(int[] nums) {
        int[] ans = new int[101];
        int c = 0;
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            ans[num]++;
        }
        for (int num : ans) {
            if (num > 0) {
                c++;
            }
        }
        return c;
    }
}
