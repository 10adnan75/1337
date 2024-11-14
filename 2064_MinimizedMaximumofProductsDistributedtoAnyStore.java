class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int lo = 0, hi = 0;
        for (int q: quantities) {
            hi = Math.max(hi, q);
        }
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (check(mid, quantities, n)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    public boolean check(int k, int[] a, int n) {
        int j = 0;
        int rem = a[j];
        for (int i=0; i<n; i++) {
            if (rem <= k) {
                j++;
                if (j == a.length) {
                    return true;
                } else {
                    rem = a[j];
                }
            } else {
                rem -= k;
            }
        }
        return false;
    }
}
