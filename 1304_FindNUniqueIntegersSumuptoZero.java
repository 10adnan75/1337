class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int lo = 0, hi = n-1;
        while (lo < hi) {
            ans[lo] = -hi;
            ans[hi] = hi;
            lo++;
            hi--;
        }
        return ans;
    }
}
