class Solution {
    
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int ans = 0;    
        int rows = grid.length, cols = grid[0].length;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j, rows, cols, 0);
                    ans = Math.max(ans, area);
                }
            }
        }
        return ans;
    }
    
    private int dfs(int[][] grid, int i, int j, int rows, int cols, int area) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] != 1) {
            return area;
        }
        grid[i][j] = 2;
        area++;
        for (int[] dir : dirs) {
            area = dfs(grid, i+dir[0], j+dir[1], rows, cols, area);
        }
        return area;
    }
}
