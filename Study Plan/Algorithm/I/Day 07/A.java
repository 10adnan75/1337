class Solution {
    
    int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] != newColor) {
            dfs(image, sr, sc, image[sr][sc], newColor);
        }
        return image;
    }
    
    private void dfs(int[][] image, int row, int col, int srcColor, int newColor) {
        int m = image.length, n = image[0].length;
        image[row][col] = newColor;
        for (int[] dir : dirs) {
            int nr = row + dir[0];
            int nc = col + dir[1];
            if (nr >= 0 && nr < m && nc >= 0 && nc < n) {
                if (image[nr][nc] == srcColor) {
                    dfs(image, nr, nc, srcColor, newColor);
                }
            }
        }
    } 
}
