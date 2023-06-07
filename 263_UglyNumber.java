class Solution {
    public boolean isUgly(int n) {
        /* TLE 
        int c = 2;
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % c == 0) {
                if (c != 2 && c != 3 && c != 5) {
                    return false;
                }
                n /= c;
            } else {
                c++;
            }
        }
        return true; 
        */

        if (n == 0) {
            return false;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1 ? true : false;
    } 
}
