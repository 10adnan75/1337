// 5 ms
class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            if (nums[lo] > 0) {
                return -1;
            } else if (Math.abs(nums[lo]) == nums[hi]) {
                return nums[hi];
            } else if (Math.abs(nums[lo]) < nums[hi]) {
                hi--;
            } else {
                lo++;
            }
        }
        return -1;
    }
}

// 2 ms
class Solution {
    public int findMaxK(int[] nums) {
        int max = -1;
        boolean ints[] = new boolean[2001];
        for (int num : nums) {
            if (ints[1000 - num]) {
                max = Math.max(max, Math.abs(num));
            }
            ints[1000 + num] = true;
        }
        return max;
    }
}
