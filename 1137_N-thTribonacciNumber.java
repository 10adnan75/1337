class Solution {
    public int tribonacci(int n) {
        if (n < 2) {
            return n;
        } else if (n == 2) {
            return 1;
        } 
        int[] series = new int[n+1];
        series[0] = 0; series[1] = 1; series[2] = 1;
        for (int i=3; i<=n; i++) {
            series[i] = series[i-1] + series[i-2] + series[i-3];
        }
        return series[n];
    }
}

//
class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return n;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 1;
        for (int i=3; i<=n; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        return arr[n];
    }
