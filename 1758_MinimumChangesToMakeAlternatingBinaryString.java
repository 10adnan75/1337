class Solution {
    public int helper(String s, char c) {
        char d = c == '0' ? '1' : '0';
        int cnt = 0;
        for (int i=0; i<s.length(); i++) {
            if ((i&1) == 1) {
                if (s.charAt(i) != c) {
                    cnt++;
                }
            } else {
                if (s.charAt(i) != d) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public int minOperations(String s) {
        return Math.min(helper(s, '0'), helper(s, '1'));
    }
}
