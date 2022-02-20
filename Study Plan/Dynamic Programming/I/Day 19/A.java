class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() < 1) {
            return true;
        }
        int idx = 0;
        for (char c : t.toCharArray()) {
            if (s.charAt(idx) == c) {
                idx += 1;
            }
            if (idx == s.length()) {
                return true;
            }
        }
        return false;
    }
}
