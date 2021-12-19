class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount < 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }
        if (coins == null || coins.length == 0) {
            return -1;
        }
        int[] dp = new int[amount+1];
        for (int i=1; i<=amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i=0; i<coins.length; i++) {
            if (coins[i] >= 0 && coins[i] <= amount) {
                dp[coins[i]] = 1;
            }
        }
        for (int i=1; i<=amount; i++) {
            int temp = dp[i];
            for (int j=0; j<coins.length; j++) {
                if (i-coins[j] >= 0) {
                    if (dp[i-coins[j]] == Integer.MAX_VALUE) {
                        temp = Math.min(temp, Integer.MAX_VALUE);
                    } else {
                        temp = Math.min(temp, dp[i-coins[j]]+1);
                    }
                }
            }
            dp[i] = temp;
        }
        if (dp[amount] == Integer.MAX_VALUE) {
            return -1;
        } 
        return dp[amount];
    }
}
