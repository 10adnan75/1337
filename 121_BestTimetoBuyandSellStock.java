class Solution {
    
    public int maxProfit(int[] prices) {
        
        // One pass - Runtime: 5 ms, Memory: 105.3 MB
        /* if (prices == null || prices.length <= 1) {
            return 0;
        }
        int minSoFar = prices[0];
        int ans = 0;
        for (int i=1; i<prices.length; i++) {
            ans = Math.max(ans, prices[i]-minSoFar);
            minSoFar = Math.min(minSoFar, prices[i]); 
        }
        return ans; */
        
        // Dynamic Programming - Runtime: 7 ms, Memory: 107.6 MB
        /* if (prices.length == 0) {
            return 0;
        }
        int[] profit = new int[prices.length];
        for (int i=0; i<profit.length; i++) {
            profit[i] = 0;
        }
        int minSoFar = prices[0];
        for (int i=1; i<prices.length; i++) {
            if (prices[i] < minSoFar) {
                minSoFar = prices[i];
            }
            profit[i] = Math.max(profit[i-1], prices[i]-minSoFar);
        }
        return profit[prices.length-1]; */
      
        // My approach - Runtime: 3 ms, Memory: 105.2 MB
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int min = prices[0], max = Integer.MIN_VALUE;
        for (int i=0; i<prices.length; i++) {
            int money = prices[i] - min;
            if (money > max) {
                max = money;
            }
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return max;
    }
}

// My code: FEB 25, 2026, 5:35 PM, US
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] maxValueFromRight = new int[n];
        maxValueFromRight[n-1] = prices[n-1];
        int profit = 0;

        for (int i=n-2; i>=0; i--) {
            maxValueFromRight[i] = Math.max(maxValueFromRight[i+1], prices[i]);
        }

        for (int i=0; i<n; i++) {
            profit = Math.max(profit, maxValueFromRight[i]-prices[i]);
        }

        return profit;
    }
}
