class Solution {
    public int findMaxLength(int[] nums) {
        int[] sums = new int[nums.length+1];
        for (int i=1; i<sums.length; i++) {
            sums[i] = nums[i-1] == 0 ? sums[i-1]-1 : sums[i-1]+1;
        }
        return findMaxDistance(sums);
    }

    public int findMaxDistance(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                max = Math.max(max, i-map.get(nums[i]));
            } else {
                map.put(nums[i], i);
            }
        }
        return max;
    }
}
