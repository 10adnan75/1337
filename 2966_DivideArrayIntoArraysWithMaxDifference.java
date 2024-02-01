class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] ans = new int[nums.length/3][3];
        int[] freq = new int[100001];
        for (int n: nums) {
            freq[n]++;
        }
        int r = 0, c = 0;
        for (int i=1; i<freq.length; i++) {
            while (freq[i]-- > 0) {
                if (c == 3) {
                    r++;
                    c = 0;
                }
                ans[r][c++] = i;
            }
        }
        for (int[] a: ans) {
            if (a[2]-a[0] > k) {
                return new int[][] {};
            }
        }
        return ans;
    }
}
