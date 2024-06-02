// 1 ms
class Solution {
    public void reverseString(char[] s) {
        int lo=0, hi=s.length-1;
        while (lo < hi) {
            char temp = s[lo];
            s[lo++] = s[hi];
            s[hi--] = temp;
        }
    }
}

// My code: 0 ms
class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for (int i=0; i<n/2; i++) {
            char c = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = c;
        }
    }
}
