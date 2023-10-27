// 1499 ms, dumb me -_-
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c = 0;
        for (int i=0; i<=arr.length-k; i++) {
            int sum = 0;
            for (int j=i; j<i+k; j++) {
                sum += arr[j];
            }
            if (sum / k >= threshold) {
                c++;
            }
        }
        return c;
    }
}

// 3 ms, lol XD
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c = 0;
        int sum = 0;
        for (int i=0; i<k; i++) {
            sum += arr[i];
        }
        if (sum/k >= threshold) {
            c++;
        }
        for (int i=k; i<arr.length; i++) {
            sum += arr[i] - arr[i-k];
            if (sum/k >= threshold) {
                c++;
            }
        }
        return c;
    }
}
