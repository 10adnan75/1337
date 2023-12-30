class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];
        for (String word: words) {
            for (char c: word.toCharArray()) {
                freq[c-'a']++;
            }
        }
        for (int i: freq) {
            if (i != 0 && i % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}
