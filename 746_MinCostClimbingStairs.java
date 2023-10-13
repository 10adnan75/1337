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
