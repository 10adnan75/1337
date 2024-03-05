class Solution {
    public int minimumLength(String s) {
        int lo = 0, hi = s.length()-1, c = 0;
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                break;
            }
            char ch = s.charAt(lo);
            while (lo <= hi && s.charAt(lo) == ch) {
                lo++;
                c++;
            }
            while (lo <= hi && s.charAt(hi) == ch) {
                hi--;
                c++;
            }
        }
        return s.length() - c;
    }
}
