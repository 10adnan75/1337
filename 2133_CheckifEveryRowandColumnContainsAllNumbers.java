class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        int[][] row = new int[n][n];
        int[][] col = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                row[i][matrix[i][j]-1]++;
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                col[j][matrix[i][j]-1]++;
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (row[i][j] != 1) {
                    return false;
                }
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (col[i][j] != 1) {
                    return false;
                }
            }
        }
        // for (int i=0; i<n; i++) {
        //     for (int j=0; j<n; j++) {
        //         System.out.print(col[i][j] + "\t");
        //     }
        //     System.out.println();
        // }
        return true;
    }
}
