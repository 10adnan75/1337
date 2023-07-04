class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
            int j = i + 2;
            while (j < arr.length) {
                for (int k=i; k<=j; k++) {
                    sum += arr[k];
                }
                j += 2;
            }
        }
        return sum;
    }
}
