class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        int[] zerosRow = new int[r], zerosCol = new int[c], onesRow = new int[r], onesCol = new int[c];
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if (grid[i][j] == 1) {
                    onesRow[i]++;
                    onesCol[j]++;
                } else {
                    zerosRow[i]++;
                    zerosCol[j]++;
                }
            }
        }
        int[][] matrix = new int[r][c];
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                matrix[i][j] = onesRow[i] + onesCol[j] - zerosRow[i] - zerosCol[j];
            }
        }
        return matrix;
    }
}
