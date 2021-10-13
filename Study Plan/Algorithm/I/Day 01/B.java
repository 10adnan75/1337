/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (!isBadVersion(n)) {
            return n + 1;
        }
        int lo = 1, hi = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isBadVersion(mid)) {
                return firstBadVersion(mid - 1);
            }
            lo = mid + 1;
        }
        return n;
    }
}
