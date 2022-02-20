class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int[][] maxs = new int[matrix.length][matrix[0].length];
        int max = 0;
        for (int i=0; i<matrix.length; i++) {
            maxs[i][0] = matrix[i][0] - '0';
            max = Math.max(max, maxs[i][0]);
        }
        for (int j=0; j<matrix[0].length; j++) {
            maxs[0][j] = matrix[0][j] - '0';
            max = Math.max(max, maxs[0][j]);
        }
        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    maxs[i][j] = Math.min(Math.min(maxs[i-1][j-1], maxs[i-1][j]), maxs[i][j-1]) + 1;
                }
                max = Math.max(max, maxs[i][j]);
            }
        }
        return max * max;
    }
}
