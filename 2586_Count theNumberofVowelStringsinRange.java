class Solution {
    public boolean check(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int vowelStrings(String[] words, int left, int right) {
        int c = 0;
        for (int i=left; i<=right; i++) {
            if (check(words[i].charAt(0)) && check(words[i].charAt(words[i].length()-1))) {
                c++;
            }
        }
        return c;
    }
}
