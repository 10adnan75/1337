class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for (char c: s.toCharArray()) {
            if (freq[c-'a'] == 2) {
                n -= 2;
                freq[c-'a'] = 1;
            } else {
                freq[c-'a']++;
            }
        }
        return n;
    }
}
