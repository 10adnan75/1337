class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int idx = (int)(arr.length * 0.05);
        double ans = 0.0;
        for (int i=idx; i<arr.length-idx; i++) {
            ans += arr[i];
        }
        return ans / (arr.length-idx*2);
    }
}
