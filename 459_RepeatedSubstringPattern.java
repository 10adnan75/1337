class Solution {
    public boolean help(String a, String b) {
        int n = b.length();
        for (int i=1; i<a.length()-n; i++) {
            if (a.substring(i, i+n).equals(b)) {
                return true;
            }
        }
        return false;
    }

    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return help(str, s);
    }
}
