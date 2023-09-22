class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals("")) {
            return true;
        }
        if (t.equals("")) {
            return false;
        }
        int idx = 0;
        for (int i=0; i<t.length(); i++) {
            if (t.charAt(i) == s.charAt(idx)) {
                idx++;
            }
            if (idx == s.length()) {
                return true;
            }
        }
        return false;
    }
}
