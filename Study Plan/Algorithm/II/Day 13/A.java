class Solution {
    public int jump(int[] nums) {
        int size = nums.length;
        if (size <= 1) {
            return 0;
        }
        int last = 0, cur = 0, step = 0;
        for (int i=0; i<size; i++) {
            if (i > last) {
                last = cur;
                step++;
            }
            cur = Math.max(cur, nums[i]+i);
            if (cur >= size-1) {
                return step + 1;
            }
        }
        return step;
    }
}
