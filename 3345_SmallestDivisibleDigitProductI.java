class Solution {
    public int smallestNumber(int n, int t) {
        int i = n;
        for (; i<Integer.MAX_VALUE; i++) {
            if (check(i, t)) {
                return i;
            }
        }
        return i; 
    }

    public boolean check(int n, int t) {
        int prod = 1;
        while (n != 0) {
            int rem = n % 10;
            if (rem == 0) {
                return true;
            }
            prod *= rem;
            n /= 10;
        }
        return prod % t == 0;
    }
}
