// Dynamic programming: 1 ms
class Solution {
    public int integerBreak(int n) {
        if (n <= 1) {
            return -1;
        }
        int[] dp = new int[n+1];
        dp[1] = 1; dp[2] = 1;
        for (int i=3; i<=n; i++) {
            dp[i] = dp[2] * (i-2);
            for (int j=2; j<=i-1; j++) {
                dp[i] = Math.max(dp[i], Math.max(dp[j], j)*Math.max(i-j, dp[i-j]));
            }
        }
        return dp[n];
    }
}

// My code (simple math): 0 ms
class Solution {
    public int integerBreak(int n) {
        if (n < 4) {
            return n-1;
        }
        int ans = 1;
        while (n > 4) {
            ans *= 3;
            n -= 3;
        }
        return ans*n;
    }
}
