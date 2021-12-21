class Solution {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int[] series = new int[n+1];
        series[0] = 0;
        series[1] = 1;
        for (int i=2; i<=n; i++) {
            series[i] = series[i-1] + series[i-2];
        }
        return series[n];
    }
}
