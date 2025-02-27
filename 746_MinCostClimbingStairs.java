class Solution {
    public int minCostClimbingStairs(int[] cost) {
        for (int i=2; i<cost.length; i++) {
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[cost.length-1], cost[cost.length-2]);
    }
}

// My code: dynamic programming
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+2];
        for (int i=cost.length-1; i>=0; i--) {
            dp[i] = cost[i] + Math.min(dp[i+1], dp[i+2]);
        }
        return Math.min(dp[0], dp[1]);
    }
}

// My code
// FEB 26, 2025, 5:00 PM, US
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        if (n <= 1) {
            return 0;
        }

        int[] dp = new int[n];
        
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i=2; i<n; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }

        return Math.min(dp[n-1], dp[n-2]);
    }
}
