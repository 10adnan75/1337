class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        if (s.length() == 2 && s.charAt(0) != s.charAt(1)) {
            return String.valueOf(s.charAt(0));
        }
        int len = s.length();
        int maxLen = 1;
        boolean[][] dp = new boolean[len][len];
        String longest = null;
        for (int k=0; k<len; k++) {
            for (int i=0; i<len-k; i++) {
                int j = i + k;
                if (s.charAt(i) == s.charAt(j) && (j-i <= 2 || dp[i+1][j-1])) {
                    dp[i][j] = true;
                    if (j-i+1 > maxLen) {
                        maxLen = j - i + 1;
                        longest = s.substring(i, j+1);
                    }
                }
            }
        }
        if (longest == null) {
            return String.valueOf(s.charAt(0));
        }
        return longest;
    }
}
