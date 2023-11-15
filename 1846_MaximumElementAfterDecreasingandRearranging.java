class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        if (arr[i] != 1) {
            arr[i] = 1;
        }
        for (i=1; i<arr.length; i++) {
            if (arr[i] - arr[i-1] > 1) {
                arr[i] = arr[i-1] + 1;
            }
        }
        return arr[i-1];
    }
}
