class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1, sum = 0;
        int i = 0;
        while (n != 0) {
            i = n % 10;
            sum += i;
            prod *= i;
            n /= 10;
        }
        return prod - sum;
    }
}
