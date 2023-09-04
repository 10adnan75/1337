class Solution {
    public boolean evenDigits(int n) {
        String s = n + "";
        return (s.length() & 1) == 0;
    }

    public boolean isSymmetric(int n) {
        String s = n + "";
        int mid = s.length() / 2;
        int c = 0;
        for (int i=0; i<mid; i++) {
            c += (int)s.charAt(i) - '0';
        }
        for (int i=mid; i<s.length(); i++) {
            c -= (int)s.charAt(i) - '0';
        }
        return c == 0;
    }

    public int countSymmetricIntegers(int low, int high) {
        int c = 0;
        for (int i=low; i<=high; i++) {
            if (evenDigits(i) && isSymmetric(i)) {
                c++;
            }
        }
        return c;
    }
}
