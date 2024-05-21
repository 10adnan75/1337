class Solution {
    public int maxSum(int[][] grid) {
        int sum = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (check(grid, i, j)) {
                    sum = Math.max(sum, getSum(createGrid(grid, i, j)));
                }
            }
        }
        return sum;
    }

    public int[][] createGrid(int[][] grid, int r, int c) {
        int[][] aux = new int[3][3];
        for (int i=r, x=0; i<r+3; i++, x++) {
            for (int j=c, y=0; j<c+3; j++, y++) {
                aux[x][y] = grid[i][j];
            }
        }
        return aux;
    }

    public boolean check(int[][] grid, int i, int j) {
        return i+3 <= grid.length && j+3 <= grid[0].length;
    }

    public int getSum(int[][] grid) {
        return grid[0][0] + grid[0][1] + grid[0][2] + grid[1][1] + grid[2][0] + grid[2][1] + grid[2][2];
    }
}
