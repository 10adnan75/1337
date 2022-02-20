class Solution {
    public int maxProfit(int[] prices) {
        int maxpro = 0;
        for (int i=1; i<prices.length; i++) {
            maxpro += Math.max(0, prices[i]-prices[i-1]);
        }
        return maxpro;
    }
}
