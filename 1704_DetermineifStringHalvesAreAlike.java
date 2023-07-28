class Solution {
    public boolean isAVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public int countVowels(String s) {
        int c = 0;
        for (int i=0; i<s.length(); i++) {
            if (isAVowel(s.charAt(i))) {
                c++;
            }
        }
        return c;
    }

    public boolean halvesAreAlike(String s) {
        return countVowels(s.substring(0, s.length()/2)) == countVowels(s.substring(s.length()/2, s.length()));
    }
}
