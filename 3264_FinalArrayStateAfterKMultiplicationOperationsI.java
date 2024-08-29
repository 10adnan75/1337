class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k-- > 0) {
            nums[getMin(nums)] *= multiplier;
        }
        return nums;
    }

    public int getMin(int[] a) {
        int min = Integer.MAX_VALUE, id = 0, minIdx = 0;
        for (int i: a) {
            if (min > i) {
                min = i;
                minIdx = id;
            }
            id++;
        }
        return minIdx;
    }
}
