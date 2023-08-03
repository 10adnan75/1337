class Solution {
    public boolean check(String word, String pref) {
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

    public int prefixCount(String[] words, String pref) {
        int c = 0;
        for (String word : words) {
            if (check(word, pref)) {
                c++;
            } 
        }
        return c;
    }
}
