class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int c = 1, n = nums.length;
        if (k == 1) {
            return nums;
        }
        int[] res = new int[n-k+1];
        Arrays.fill(res, -1);
        for (int i=0; i<n-1; i++) {
            if (nums[i]+1 == nums[i+1]) {
                c++;
            } else {
                c = 1;
            }
            if (c >= k) {
                res[i-k+2] = nums[i+1];
            }
        }
        return res;
    }
}
