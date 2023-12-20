// 1 ms
class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Math.min(prices[0], prices[1]), sMin = Math.max(prices[0], prices[1]);
        for (int i=2; i<prices.length; i++){
            if (prices[i] < min) {
                sMin = min;
                min = prices[i];
            } else if (prices[i] < sMin) {
                sMin = prices[i];
            }
        }
        return (min + sMin <= money) ? money - min - sMin : money;
    }
}

// 2 ms
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int ans = money - (prices[0] + prices[1]);
        return ans >= 0 ? ans : money;
    }
}
