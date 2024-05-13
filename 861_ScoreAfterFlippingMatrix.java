class Solution {
    public int matrixScore(int[][] grid) {
        int r = 0;
        for (int[] row: grid) {
            if (row[0] == 0) {
                flipRow(grid, r);
            }
            r++;
        }
        for (r=0; r<grid[0].length; r++) {
            int zero = 0, c = 0;
            for (c=0; c<grid.length; c++) {
                if (grid[c][r] == 0) {
                    zero++;
                }
            }
            if (zero > grid.length-zero) {
                flipCol(grid, r);
            }
        }
        int score = 0;
        for (int[] row: grid) {
            String s = "";
            for (int i: row) {
                s += i;
            }
            score += Integer.parseInt(s,2);
        }
        return score;
    }

    public void flipRow(int[][] grid, int i) {
        for (int j=0; j<grid[0].length; j++) {
            grid[i][j] = grid[i][j] == 1 ? 0 : 1;
        }
    }

    public void flipCol(int[][] grid, int j) {
        for (int i=0; i<grid.length; i++) {
            grid[i][j] = grid[i][j] == 1 ? 0 : 1;
        }
    }
}
