// Brute force
class Solution {
    public boolean isPalindrome(int l, int r, String s) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        for (int i=s.length(); i>0; i--) {
            for (int j=0; j<=s.length()-i; j++) {
                if (isPalindrome(j, j+i-1, s)) {
                    return s.substring(j, j+i);
                }
            }
        }
        return "";
    }
}
