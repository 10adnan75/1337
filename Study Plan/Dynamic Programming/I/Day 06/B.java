class Solution {
    public int getMaxLen(int[] nums) {
        int positive = nums[0] > 0 ? 1 : 0;
        int negative = nums[0] < 0 ? 1 : 0;
        int max = positive;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] > 0) {
                positive++;
                if (negative > 0) {
                    negative++;
                }
            } else if (nums[i] < 0) {
                int tempPositive = negative > 0 ? negative + 1 : 0;
                negative = positive + 1;
                positive = tempPositive;
            } else {
                positive = 0;
                negative = 0;
            }
            max = Math.max(max, positive);
        }
        return max;
    }
}
