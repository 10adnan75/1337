class Solution {
    public int[][] matrix;

    public void updateMatrix(int[] a) {
        for (int i=0; i<matrix[0].length; i++) {
            matrix[a[0]][i]++;
        }
        for (int i=0; i<matrix.length; i++) {
            matrix[i][a[1]]++;
        }
    }

    public int oddCells(int m, int n, int[][] indices) {
        matrix = new int[m][n];
        for (int[] index : indices) {
            updateMatrix(index);
        }
        int c = 0;
        for (int[] row : matrix) {
            for (int i : row) {
                if ((i & 1) == 1) {
                    c++;
                }
            }
        }
        return c;
    }
}
