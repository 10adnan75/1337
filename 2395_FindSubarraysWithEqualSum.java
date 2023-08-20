class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i=0, j=1; j<nums.length; i++, j++) {
            if (set.contains(nums[i] + nums[j])) {
                return true;
            }
            set.add(nums[i] + nums[j]);
        }
        return false;
    }
}
