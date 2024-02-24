class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] freq = new int[100001];
        int max = 0, c = 0;
        for (int cost: costs) {
            max = Math.max(max, cost);
            freq[cost]++;
        }
        for (int i=1; i<=max; i++) {
            while (freq[i]-- > 0) {
                if (coins - i < 0 || coins == 0) {
                    break;
                }
                coins -= i;
                c++;
            }
        }
        return c;
    }
}
