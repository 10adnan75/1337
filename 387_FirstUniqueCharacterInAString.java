class Solution {
    public int firstUniqChar(String s) {
        int[] hash = new int[26];
        for (int i=0; i<s.length(); i++) {
            hash[s.charAt(i)-'a']++;
        }
        for (int i=0; i<s.length(); i++) {
            if (hash[s.charAt(i)-'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}

// My code: 5 ms
class Solution {
    public int firstUniqChar(String s) {
        int ch = -1, i = 0;
        int[] freq = new int[26];
        for (char c: s.toCharArray()) {
            freq[c-'a']++;
        }
        for (char c: s.toCharArray()) {
            if (freq[c-'a'] == 1) {
                return i;
            }
            i++;
        }
        return ch;
    }
}
