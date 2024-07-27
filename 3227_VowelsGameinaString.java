class Solution {
    public boolean doesAliceWin(String s) {
        int vowels = 0;
        for (char c: s.toCharArray()) {
            if (isAVowel(c)) {
                vowels++;
            }
        }
        return vowels != 0;
    }

    public boolean isAVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
