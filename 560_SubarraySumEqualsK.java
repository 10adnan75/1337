class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, end = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        while (end < nums.length) {
            sum += nums[end++];
            if (map.containsKey(sum-k)) {
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
