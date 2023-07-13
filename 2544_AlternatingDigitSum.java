class Solution {
    public int alternateDigitSum(int n) {
        int sign = 1;
        int c = 0;
        int num = n;
        while (num != 0) {
            c++;
            num /= 10;
        }
        if ((c & 1) != 1) {
            sign = -sign;
        }
        c = 0;
        while (n != 0) {
            c += (n % 10) * sign;
            sign = -sign;
            n /= 10;
        }
        return c;
    }
}
