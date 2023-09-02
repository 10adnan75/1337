class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int ans = money - (prices[0] + prices[1]);
        return ans >= 0 ? ans : money;
    }
}
