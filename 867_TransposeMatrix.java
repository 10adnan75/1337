class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] transpose = new int[c][r];
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
