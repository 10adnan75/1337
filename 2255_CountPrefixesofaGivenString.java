class Solution {
    public boolean check(String pref, String word) {
        if (pref.length() > word.length()) {
            return false;
        }
        for (int i=0; i<pref.length(); i++) {
            if (word.charAt(i) != pref.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public int countPrefixes(String[] words, String s) {
        int c = 0;
        for (String word : words) {
            if (check(word, s)) {
                c++;
            }
        }
        return c;
    }
}
