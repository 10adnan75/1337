class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int[] arr = new int[numOnes+numZeros+numNegOnes];
        int i = 0;
        while (numOnes-- > 0) {
            arr[i++] = 1;
        }
        while (numZeros-- > 0) {
            arr[i++] = 0;
        }
        while (numNegOnes-- > 0) {
            arr[i++] = -1;
        }
        int ans = 0;
        for (i=0; i<k; i++) {
            ans += arr[i];
        }
        return ans;
    }
}
