// 681 / 694 testcases passed; TLE @ tc #682 :(
class Solution {
    public int maxOperations(String s) {
        int c = 0, i = s.length()-1;
        boolean zero = false;
        while (i > 0) {
            if (s.charAt(i) == '0') {
                zero = true;
            }
            if (!zero) {
                i--;
                continue;
            }
            while (zero && i > 0 && s.charAt(i) == '0') {
                i--;
            }
            c += getCountOnes(s, i);
            while (i > 0 && s.charAt(i) == '1') {
                i--;
            }
        }
        return c;
    }
    
    public int getCountOnes(String s, int end) {
        int c = 0;
        for (int i=0; i<=end; i++) {
            if (s.charAt(i) == '1') {
                c++;
            }
        }
        return c;
    }
}

// Smart Greedy + Basic Math :)
class Solution {
    public int maxOperations(String s) {
        boolean z = true;
        int c = s.length()-1, max = 0;
        while (c >=0 && s.charAt(c) == '1') {
            c--;
        }
        for (int i=c-1, zero=1; i>=0; i--) {
            if (s.charAt(i) == '1') {
                max += zero;
                z = false;
            }
            if (s.charAt(i) == '0') {
                if (z) {
                    continue;
                }
                if (i != c-1) {
                    zero++;
                    z = true;
                }
            }
        }
        return max;
    }
}
