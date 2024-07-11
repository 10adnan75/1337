class Solution {
    public boolean judgeSquareSum(int c) {
        long lo = 0, hi = (long)Math.sqrt(c);
        while (lo <= hi) {
            long s = lo*lo + hi*hi;
            if (s == c) {
                return true;
            } else if (s < c) {
                lo++;
            } else {
                hi--;
            }
        }
        return false;
    }
}
