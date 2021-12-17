class Solution {
    public int uniquePaths(int m, int n) {
        int[][] result = new int[m+1][n+1];
        for (int i=1; i<m+1; i++) {
            result[i][1] = 1;
        }
        for (int i=1; i<n+1; i++) {
            result[1][i] = 1;
        }
        for (int i=2; i<m+1; i++) {
            for (int j=2; j<n+1; j++) {
                result[i][j] = result[i-1][j] + result[i][j-1];
            }
        }
        return result[m][n];
    }
}
