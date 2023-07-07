class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                ans[i] = map.get(nums[i]);
            } else {
                int c = 0;
                for (int j=0; j<nums.length; j++) {
                    if (nums[j] < nums[i]) {
                        c++;
                    }
                }
                ans[i] = c;
                map.put(nums[i], c);
            }
        }
        return ans;
    }
}
