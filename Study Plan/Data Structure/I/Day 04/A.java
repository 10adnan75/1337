class Solution {
  
    public int[][] matrixReshape(int[][] mat, int r, int c) {
      
        // Brute force O(rc) - Runtime: 0 ms, Memory: 40 MB (quadratic)
        /* int n = mat.length, m = mat[0].length, k = 0;
        if (r*c != n*m) {
            return mat;
        }
        int[][] ans = new int[r][c];
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++, k++) {
                ans[i][j] = mat[k/m][k%m];
            }
        }
        return ans; */
      
        // One pass O(rc) - Runtime: 0 ms, Memory: 39.9 MB (quadratic)
        int n = mat.length, m = mat[0].length;
        if (r*c != n*m) {
            return mat;
        }
        int[][] ans = new int[r][c];
        for (int i=0; i<r*c; i++) {
            ans[i/c][i%c] = mat[i/m][i%m];
        }
        return ans;
    }
}
