class Solution {
    int[] dx = new int[] {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] dy = new int[] {-1, 0, 1, -1, 1, -1, 0, 1};
    int N;
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        N = grid.length;
        Queue<int[]> queue = new LinkedList<>();
        if (grid[0][0] == 0) {
            queue.offer(new int[] {0, 0});
        }
        grid[0][0] = 1;
        int depth = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] pos = queue.poll();
                if (pos[0] == N-1 && pos[1] == N-1) {
                    return depth;
                }
                for (int i=0; i<dx.length; i++) {
                    int x = pos[0] + dx[i], y = pos[1] + dy[i];
                    if (validate(grid, x, y)) {
                        queue.offer(new int[] {x, y});
                        grid[x][y] = 1;
                    }
                }
            }
            depth++;
        }
        return -1;
    }
    
    private boolean validate(int[][] grid, int i, int j) {
        return (i >= 0 && i < N && j >= 0 && j < N && grid[i][j] == 0);
    }
}
