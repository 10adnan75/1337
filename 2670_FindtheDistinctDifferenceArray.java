class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] ans = new int[nums.length];
        Set<Integer> s = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            s.add(nums[i]);
            ans[i] = s.size();
        }
        s.clear();
        s.add(nums[nums.length-1]);
        for (int i=nums.length-2; i>=0; i--) {
            ans[i] -= s.size();
            s.add(nums[i]);
        }
        return ans;
    }
}
