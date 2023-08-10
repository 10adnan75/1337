class Solution {
    public int averageValue(int[] nums) {
        int sum = 0, n = 0;
        for (int i : nums) {
            if (i % 6 == 0) {
                sum += i;
                n++;
            }
        }
        if (n == 0) {
            return n;
        }
        return sum / n;
    }
}
