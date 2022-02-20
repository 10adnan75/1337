class Solution {
    public int combinationSum4(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] count = new int[target+1];
        count[0] = 1;
        for (int i=1; i<=target; i++) {
            for (int num : nums) {
                if (i >= num) {
                    count[i] += count[i-num];
                }
            }
        }
        return count[target];
    }
}
