class Solution {
    public int returnMax(int[] a) {
        int maxIdx = 0, max = a[0];
        for (int i=1; i<a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                maxIdx = i;
            }
        }
        a[maxIdx] = 0;
        return max;
    }

    public int deleteGreatestValue(int[][] grid) {
        int greatest = 0;
        int[] rowWiseMax = new int[grid.length];
        for (int i=0; i<grid[0].length; i++) {
            for (int j=0; j<grid.length; j++) {
                rowWiseMax[j] = returnMax(grid[j]);
            }
            greatest += returnMax(rowWiseMax);
        }
        return greatest;
    }
}
