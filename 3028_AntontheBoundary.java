class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int c = 0, sum = 0;
        for (int n: nums) {
            sum += n;
            if (sum == 0) {
                c++;
            }
        }
        return c;
    }
}
