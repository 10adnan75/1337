class Solution {
    public int minimizedStringLength(String s) {
        int[] freq = new int[26];
        for (int i=0; i<s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int c = 0;
        for (int n : freq) {
            if (n != 0) {
                c++;
            }
        }
        return c;
    }
}
