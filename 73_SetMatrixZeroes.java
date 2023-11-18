class Solution {
    public void helper(int[][] mat, int r, int c) {
        for (int i=0; i<mat[0].length; i++) {
            if (mat[r][i] != 0) {    
                mat[r][i] = Integer.MAX_VALUE-1337;
            }
        }
        for (int i=0; i<mat.length; i++) {
            if (mat[i][c] != 0) {
                mat[i][c] = Integer.MAX_VALUE-1337;
            }
        }
    }

    public void setZeroes(int[][] matrix) {
        int c = 0;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    c++;
                    helper(matrix, i, j);
                }
            }
        }
        if (c == 0) {
            return;
        }
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == Integer.MAX_VALUE-1337) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
