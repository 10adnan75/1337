// Runtime: 7 ms, Beats 39.23%
// Memory: 38.6 MB, Beats 100%
class Solution {
    public int reverse(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        return reverse(num/10, (sum*10+num%10));
    }
	
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x == reverse(x, 0)) {
            return true;
        } else {
            return false;
        }
    }
}

// Runtime: 6 ms, Beats 54.16%
// Memory: 42.5 MB, Beats 91.67%
class Solution {
    public boolean isPalindrome(int x) {
        String s = x + "";
        int n = s.length();
        for (int i=0; i<n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
}
