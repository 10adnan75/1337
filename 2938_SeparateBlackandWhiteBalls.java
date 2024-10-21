class Solution {
    public long minimumSteps(String s) {
        long maxC = 0L;
        int lo = 0, hi = s.length()-1;
        while (lo < hi) {
            char c1 = s.charAt(lo), c2 = s.charAt(hi);
            if (c1 == '1' && c2 == '0') {
                maxC += hi---lo++;
            } else if (c1 == '1') {
                hi--;
            } else {
                lo++;
            }
        }
        return maxC;
    }
}
