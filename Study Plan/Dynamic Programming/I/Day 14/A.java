class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[][] preSum = new int[m+1][n+1];
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                preSum[i][j] = preSum[i-1][j] + preSum[i][j-1] - preSum[i-1][j-1] + mat[i-1][j-1];
            }
        }
        int[][] ans = new int[m][n];
        for (int i=0; i<m; i++) {
            int r1 = Math.max(i-k, 0);
            int r2 = Math.min(i+k, m-1);
            for (int j=0; j<n; j++) {
                int c1 = Math.max(j-k, 0);
                int c2 = Math.min(j+k, n-1);
                ans[i][j] = preSum[r2+1][c2+1] - preSum[r1][c2+1] - preSum[r2+1][c1] + preSum[r1][c1];
            }
        }
        return ans; 
    }
}
