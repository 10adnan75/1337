class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max = 0;
        for (int i=0; i<nums.length; i++) {
            max = Math.max(max, helper(nums, k, i));
        }
        return max;
    }

    public int helper(int[] nums, int k, int start) {
        int c = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=start; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (map.get(nums[i])+1 > k) {
                    return c;
                }
                map.put(nums[i], map.get(nums[i])+1);
                c++;
            } else {
                map.put(nums[i], 1);
                c++;
            }
        }
        return c;
    }
}
