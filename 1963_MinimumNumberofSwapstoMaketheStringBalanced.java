class Solution {
    public int minSwaps(String s) {
        int swaps = 0, open = 0, close = 0, lo = 0, hi = s.length()-1;
        while (lo < hi) {
            char c = s.charAt(lo);
            if (c == ']') {
                close++;
            } else {
                open++;
            }
            if (close > open) {
                while (s.charAt(hi) != '[') {
                    hi--;
                }
                swaps++;
                open++;
                close--;
                hi--;
            }
            lo++;
        }
        return swaps;
    }
}
