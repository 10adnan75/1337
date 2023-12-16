// My code: TLE :(
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

// 2 ms
class Solution {
    public int consecutiveNumbersSum(int n) {
        int sum = 0, c = 0;
        for (int i=1; sum<n; i++) {
            sum += i;
            if ((n-sum) % i == 0) {
                c++;
            }
        }
        return c;
    }
}
