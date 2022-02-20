class NumMatrix {
    private int[][] regionSum;
    
    public NumMatrix(int[][] matrix) {
        int m = matrix.length, n = m > 0 ? matrix[0].length : 0;
        regionSum = new int[m+1][n+1];
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                regionSum[i][j] = regionSum[i-1][j] + regionSum[i][j-1] - regionSum[i-1][j-1] + matrix[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return regionSum[row2+1][col2+1] + regionSum[row1][col1] - regionSum[row1][col2+1] - regionSum[row2+1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
