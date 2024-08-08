class Solution {
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for (char c: s.toCharArray()) {
            freq[c-'a']++;
        }
        int size = s.length();
        while (size-- > 0) {
            for (int i=0; i<26; i++) {
                if (freq[i] != 0) {
                    sb.append((char)(i+'a'));
                    freq[i]--;
                }
            }
            for (int i=25; i>=0; i--) {
                if (freq[i] != 0) {
                    sb.append((char)(i+'a'));
                    freq[i]--;
                }
            }
        }
        return sb.toString();
    }
}
