// Brute force
// Solapur, MH, IN
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

// Monotonic stack
// Los Angeles, CA, USA
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = prices.clone();
        stack.push(0);
        for (int i=1; i<n; i++) {
            int curr = prices[i];
            while (!stack.empty() && prices[stack.peek()] >= curr) {
                ans[stack.pop()] -= curr;
            }
            stack.push(i);
        }
        return ans;
    }
}
