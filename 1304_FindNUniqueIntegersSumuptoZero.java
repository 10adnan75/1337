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

// Aug 24, 2024
class Solution {
    public int[] sumZero(int n) {
        int[] a = new int[n];
        int i = n/2, id = 0;
        for (int j=-i; j<=i; j++) {
            if (j == 0 && (n&1) == 0) {
                continue;
            }
            a[id++] = j;
        }
        return a;
    }
}
