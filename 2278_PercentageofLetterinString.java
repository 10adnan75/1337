class Solution {
    public int percentageLetter(String s, char letter) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c-'a']++;
        }
        return freq[letter-'a']*100 / s.length();
    }
}
