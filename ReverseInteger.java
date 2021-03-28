class Solution {
    public int reverse(int x) {
        long n = 0L;
        while(x != 0) {
            n = (n * 10) + (x % 10);
            x /= 10;
        }
        if(n > 2147483647) return 0;
        if(-Math.pow(2,31) <= n && n <= Math.pow(2,31)-1) return (int) n;
        return 0;
    }
}
