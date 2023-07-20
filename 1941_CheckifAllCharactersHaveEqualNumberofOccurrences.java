class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] letters = new int[26];
        for (int i=0; i<s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }
        int c = 0;
        for (int i=0; i<letters.length; i++) {
            if (letters[i] != 0) {
                c = letters[i];
                break;
            }
        }
        for (int i : letters) {
            if (i != 0 && i != c) {
                return false;
            }
        }
        return true;
    }
}
