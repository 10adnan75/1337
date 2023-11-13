class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for (int j=0; j<grid[0].length; j++) {
            int max = 0;
            for (int i=0; i<grid.length; i++) {
                max = Math.max(max, (grid[i][j] + "").length());
            }
            ans[j] = max;
        }
        return ans;
    }
}
