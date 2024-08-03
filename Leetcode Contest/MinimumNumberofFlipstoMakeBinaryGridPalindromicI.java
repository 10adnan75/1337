class Solution {
    public int minFlips(int[][] grid) {
        return Math.min(checkRows(grid), checkColumns(grid));
    }

    public int checkRows(int[][] grid) {
        int c = 0;
        for (int[] row: grid) {
            c += checkPalindrome(row);
        }
        return c;
    }

    public int checkColumns(int[][] grid) {
        int c = 0;
        for (int i=0; i<grid[0].length; i++) {
            int[] col = new int[grid.length];
            for (int j=0; j<grid.length; j++) {
                col[j] = grid[j][i];
            }
            c += checkPalindrome(col);
        }
        return c;
    }

    public int checkPalindrome(int[] a) {
        int c = 0, lo = 0, hi = a.length-1;
        while (lo < hi) {
            if (a[lo++] != a[hi--]) {
                c++;
            }
        }
        return c;
    }
}
