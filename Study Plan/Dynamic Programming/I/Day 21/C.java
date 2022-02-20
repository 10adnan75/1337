class Solution {
    public int numSquares(int n) {
        if (n <= 0) {
            return 0;
        }
        int m = (int) Math.sqrt(n);
        long[] dp = new long[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i=0; i<dp.length; i++) {
            for (int j=1; j<=m; j++) {
                int num = j * j;
                if (i+num <= n) {
                    dp[i+num] = Math.min(dp[i+num], dp[i]+1);
                }
            }
        }
        return (int) dp[n];
    }
}
