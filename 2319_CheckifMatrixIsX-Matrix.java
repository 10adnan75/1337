class Solution {
    public boolean checkDiags(int[][] grid, int n) {
        for (int i=0; i<n; i++) {
            if (grid[i][i] == 0 || grid[i][n-i-1] == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        if (checkDiags(grid, n)) {
            return false;
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i != j && n-i-1 != j) {
                    if (grid[i][j] > 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
