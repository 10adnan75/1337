class Solution {
    public int countEven(int num) {
        int c = 0;
        for (int i=1; i<=num; i++) {
            int n = i;
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            if ((sum & 1) != 1) {
                c++;
            }
        }
        return c;
    }
}
