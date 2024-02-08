class Solution {
    public int[] finalPrices(int[] prices) {
        int[] finalPrice = new int[prices.length];
        for (int i=0; i<prices.length; i++) {
            int min = 1001;
            for (int j=i+1; j<prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    min = prices[j];
                    break;
                }
            }
            if (min == 1001) {
                min = 0;
            }
            finalPrice[i] = prices[i] - min;
        }
        return finalPrice;
    }
}
