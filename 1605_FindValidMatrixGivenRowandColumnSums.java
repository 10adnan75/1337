// My approach (need to work on this)
class Solution {
    private int[][] ans;

    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length, n = colSum.length, min = Integer.MAX_VALUE, min_idx = -1;
        ans = new int[m][n];
        for (int i=0; i<m; i++) {
            if (rowSum[i] < min) {
                min = rowSum[i];
                min_idx = i;
            }
        }
        boolean col = false;
        for (int i=0; i<n; i++) {
            if (colSum[i] < min) {
                min = colSum[i];
                min_idx = i;
                col = true;
            }
        }
        createMatrix(rowSum, colSum, min_idx, col);
        return ans;
    }

    public void createMatrix(int[] rsum, int[] csum, int min_idx, boolean c) {
        if (c) {
            ans[0][min_idx] = csum[min_idx];

        } else {
            ans[min_idx][0] = rsum[min_idx];
            for (int i: csum) {
                
            }
        }
    }
}

// 
class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length, n = colSum.length, i = 0, j = 0;
        int[][] ans = new int[m][n];
        while (i < m && j < n) {
            if (rowSum[i] < colSum[j]) {
                ans[i][j] = rowSum[i];
                colSum[j] -= rowSum[i];
                rowSum[i] -= rowSum[i];
                i++;
            } else {
                ans[i][j] = colSum[j];
                rowSum[i] -= colSum[j];
                colSum[j] -= colSum[j];
                j++;
            }
        }
        return ans;
    }
}
