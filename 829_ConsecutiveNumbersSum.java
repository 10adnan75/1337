class Solution {
    public int consecutiveNumbersSum(int n) {
        int c = 0;
        for (int i=1; i<=n; i++) {
            int sum = i;
            for (int j=i+1; j<n; j++) {
                if (sum >= n) {
                    break;
                }
                sum += j;
            }
            if (sum == n) {
                c++;       
            }
        }
        return c;
    }
}
