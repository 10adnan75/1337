class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        for (int i=0, j=0, k=n; i<ans.length; i+=2, j++, k++) {
            ans[i] = nums[j];
            ans[i+1] = nums[k];
        }
        return ans;
    }
}
