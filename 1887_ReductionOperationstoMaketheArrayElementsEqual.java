class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int c = 0, ans = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                c++;
            }
            ans += c;
        }
        return ans;
    }
}
