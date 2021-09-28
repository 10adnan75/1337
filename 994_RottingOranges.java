class Solution {
    
    int[][] DIRS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    public int orangesRotting(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                } else if (grid[i][j] == 2) {
                    q.offer(new int[] {i, j});
                }
            }
        }
        int count = 0;
        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();
            for (int i=0; i<size; i++) {
                int[] curr = q.poll();
                for (int[] dir : DIRS) {
                    int nextX = curr[0] + dir[0];
                    int nextY = curr[1] + dir[1];
                    if (nextX < 0 || nextX >= rows || nextY < 0 || nextY >= cols || grid[nextX][nextY] != 1) {
                        continue;
                    }
                    q.offer(new int[] {nextX, nextY});
                    grid[nextX][nextY] = 2;
                    fresh--;
                }
            }
            count++;
        }
        return fresh == 0 ? count : -1;
    }
}
