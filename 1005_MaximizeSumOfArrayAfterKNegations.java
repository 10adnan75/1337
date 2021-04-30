class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        while (K-- > 0) {
            A[0] = -A[0];
            Arrays.sort(A);
        }
        int sum = 0;
        for (int i=0; i<A.length; i++) sum += A[i];
        return sum;
    }
}
