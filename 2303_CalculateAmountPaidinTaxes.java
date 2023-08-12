class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double ans = 0.0;
        int prev = 0;
        int i = 0;
        while (i < brackets.length) {
            if (prev > income) {
                break;
            }
            ans += (Math.min(income, brackets[i][0]) - prev) * (brackets[i][1] / 100.0); 
            prev = brackets[i][0];
            i++;
        }
        return ans;
    }
}
