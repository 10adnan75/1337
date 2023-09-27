// Brute force, O(n^2)
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[][] freq = new int[n][n+1];
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                freq[i][A[j]]++;
                freq[i][B[j]]++;
            }
        }
        int[] ans = new int[n];
        for (int i=0; i<n; i++) {
            int c = 0;
            for (int j=0; j<=n; j++) {
                if (freq[i][j] == 2) {
                    c++;
                }
            }
            ans[i] = c;
        }
        return ans;
    }
}

// Optimized, O(n)
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = B.length, c = 0;
        int[] ans = new int[n], freq = new int[n+1];
        for (int i=0; i<n; i++) {
            freq[A[i]]++;
            if (freq[A[i]] > 1) {
                c++;
            }
            freq[B[i]]++;
            if (freq[B[i]] > 1) {
                c++;
            }
            ans[i] = c;
        }
        return ans;
    }
}
