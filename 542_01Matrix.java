class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        // BFS: TC - O(n^n), SC - O(n)
        /* int rows = mat.length, cols = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new int[]{i, j});
                } else {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int[][] dir = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            for (int[] d : dir) {
                int i = curr[0] + d[0];
                int j = curr[1] + d[1];
                if (i < 0 || j < 0 || i >= rows || j >= cols || mat[i][j] <= mat[curr[0]][curr[1]] + 1) {
                    continue;
                }
                mat[i][j] = mat[curr[0]][curr[1]] + 1;
                q.offer(new int[]{i, j});
            }
        }
        return mat; */
        
        // DFS: TC - O(n), SC - O(n)
        if (mat.length == 0) {
            return mat;
        }
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[0].length; j++) {
                if (mat[i][j] == 1 && !hasAdjacentZero(mat, i, j)) {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    DFS(mat, i, j, -1);
                }
            }
        }
        return mat;
    }
    
    private void DFS(int[][] mat, int row, int col, int val) {
        if (row < 0 || col < 0 || row >= mat.length || col >= mat[0].length || mat[row][col] <= val) {
            return;
        }
        if (val >= 0) {
            mat[row][col] = val;
        }
        DFS(mat, row - 1, col, mat[row][col] + 1);
        DFS(mat, row, col - 1, mat[row][col] + 1);
        DFS(mat, row + 1, col, mat[row][col] + 1);
        DFS(mat, row, col + 1, mat[row][col] + 1);
    }
    
    private boolean hasAdjacentZero(int[][] mat, int row, int col) {
        if ((row > 0 && mat[row-1][col] == 0) || (col > 0 && mat[row][col-1] == 0)) {
            return true;
        }
        if ((row < mat.length-1 && mat[row+1][col] == 0) || (col < mat[0].length-1 && mat[row][col+1] == 0)) {
            return true;
        }
        return false;
    }
}
