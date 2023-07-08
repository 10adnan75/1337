// Sorting, 2 ms, beats 74.47%
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
    }
}

// Max and Second max, 0 ms, beats 100%
class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, sMax = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > max) {
                sMax = max;
                max = i;
            } else if (i > sMax) {
                sMax = i;
            }
        }
        return --max * --sMax;
    }
}
