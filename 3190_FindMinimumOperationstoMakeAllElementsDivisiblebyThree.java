class Solution {
    public int minimumOperations(int[] nums) {
        int c = 0;
        for (int num: nums) {
            c += Math.min(num%3, 3-(num%3));
        }
        return c;
    }
}
