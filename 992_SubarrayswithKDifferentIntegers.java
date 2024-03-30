class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k-1);
    }

    public int helper(int[] nums, int k) {
        int c = 0, j = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            while (map.size() > k) {
                map.put(nums[j], map.get(nums[j])-1);
                if (map.get(nums[j]) == 0) {
                    map.remove(nums[j]);
                }
                j++;
            }
            c += (i - j + 1);
        }
        return c;
    }
}
