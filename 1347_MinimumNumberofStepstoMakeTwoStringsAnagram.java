// 8 ms
class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];
        for (int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }
        for (int i=0; i<t.length(); i++) {
            freq[t.charAt(i)-'a']--;
        }
        int min = 0;
        for (int i : freq) {
            if (i < 0) {
                min += i * -1;
            }
        }
        return min;
    }
}

// 6 ms
class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];
        for (char c: t.toCharArray()) {
            freq[c-'a']++;
        }
        for (char c: s.toCharArray()) {
            freq[c-'a']--;
        }
        int c = 0;
        for (int i: freq) {
            if (i < 0) {
                c += Math.abs(i);
            }
        }
        return c;
    }
}
