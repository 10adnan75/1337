public class Solution {
    public int maxVowels(String s, int k) {
        int vowels = 0, n = s.length();
        for (int i=0; i<k; i++) {
            if (isAVowel(s.charAt(i))) {
                vowels++;
            }
        }
        int max = vowels;
        for (int i=1; i<n-k+1; i++) {
            if (isAVowel(s.charAt(i-1))) {
                vowels--;
            }
            if (isAVowel(s.charAt(i+k-1))) {
                vowels++;
            }
            max = Math.max(vowels, max);
        }
        return max;
    }

    public boolean isAVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}