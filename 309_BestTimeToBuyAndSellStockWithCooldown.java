class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int len = prices.length;
        int[] buy = new int[len+1], sell = new int[len+1];
        buy[1] = -prices[0];
        for (int i=2; i<=len; i++) {
            buy[i] = Math.max(sell[i-2]-prices[i-1], buy[i-1]);
            sell[i] = Math.max(sell[i-1], buy[i-1]+prices[i-1]);
        }
        return sell[len];
    }
}
