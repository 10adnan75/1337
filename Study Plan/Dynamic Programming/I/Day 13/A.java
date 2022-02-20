class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        for (int row=n-2; row>=0; row--) {
            for (int col=0; col<n; col++) {
                int best = matrix[row+1][col];
                if (col > 0) {
                    best = Math.min(best, matrix[row+1][col-1]);
                }
                if (col < n-1) {
                    best = Math.min(matrix[row+1][col+1], best);
                }
                matrix[row][col] += best;
            }
        }
        int res = Integer.MAX_VALUE;
        for (int x : matrix[0]) {
            if (x < res) {
                res = x;
            }
        }
        return res;
    }
}
