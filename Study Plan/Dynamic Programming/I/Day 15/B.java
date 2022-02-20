class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid[0].length;
        int m = obstacleGrid.length;
        if (m == 0 || n == 0 || obstacleGrid[0][0] == 1) {
            return 0;
        }
        int[] ways = new int[n];
        ways[0] = 1;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    ways[j] = 0;
                } else if (j > 0) {
                    ways[j] += ways[j-1];
                }
            }
        }
        return ways[n-1];
    }
}
