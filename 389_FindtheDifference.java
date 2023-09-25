// 3 ms
class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];
        for (int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }
        for (int i=0; i<t.length(); i++) {
            freq[t.charAt(i)-'a']--;
        }
        for (int i=0; i<freq.length; i++) {
            if (freq[i] == -1) {
                return (char)(i+'a');
            }
        }
        return t.charAt(0);
    }
}

// 2 ms
class Solution {
    public char findTheDifference(String s, String t) {
        int n = 0;
        for (int i=0; i<s.length(); i++) {
            n -= s.charAt(i);
        }
        for (int i=0; i<t.length(); i++) {
            n += t.charAt(i);
        }
        return (char)n;
    }
}
