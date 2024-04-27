class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[] cols = new int[matrix[0].length];
        for (int[] row: matrix) {
            for (int i=0; i<row.length; i++) {
                cols[i] = Math.max(cols[i], row[i]);
            }
        }
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = cols[j];
                }
            }
        }
        return matrix;
    }
}
