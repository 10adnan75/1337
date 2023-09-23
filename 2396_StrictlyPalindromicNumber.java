// My code
class Solution {
    public boolean isPalindrome(String s) {
        for (int i=0, j=s.length()-1; i<s.length() && j>=0; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public boolean helper(int n, int b) {
        String base = "";
        while (n != 0) {
            base += (n%b);
            n /= b;
        }
        return isPalindrome(base);
    }

    public boolean isStrictlyPalindromic(int n) {
        for (int i=2; i<n-1; i++) {
            if (!helper(n, i)) {
                return false;
            }
        }
        return true;
    }
}

// Ugly hack :)
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        return false;
    }
}
