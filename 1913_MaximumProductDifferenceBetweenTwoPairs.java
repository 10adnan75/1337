class Solution {
    public int maxProductDifference(int[] nums) {
        int max = Integer.MIN_VALUE, sMax = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sMin = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > max) {
                sMax = max;
                max = i;
            } else if (i > sMax) {
                sMax = i;
            }
            if (i < min) {
                sMin = min;
                min = i;
            } else if (i < sMin) {
                sMin = i;
            }
        }
        return max * sMax - min * sMin;
    }
}
