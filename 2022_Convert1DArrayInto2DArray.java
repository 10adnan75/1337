// Runtime: 4 ms, Beats 73.43%
// Memory: 52.6 MB, Beats 15.62%
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[][] {};
        }
        int[][] twoDArray = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                twoDArray[i][j] = original[i * n + j];
            }
        }
        return twoDArray;
    }
}

// My solution
// Runtime: 4 ms, Beats 73.43%
// Memory: 52.1 MB, Beats 51.75%
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[][] {};
        }
        int[][] twoDArray = new int[m][n];
        int i = 0, j = 0;
        for (int idx=0; idx<original.length; idx++) {
            if (j == n) {
                j = 0;
                i++;
            }
            twoDArray[i][j] = original[idx];
            j++;
            
        }
        return twoDArray;
    }
}

// Runtime: 6 ms, Beats 28.69%
// Memory: 52.5 MB, Beats 19.87%
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[][] {};
        }
        int[][] twoDArray = new int[m][n];
        for (int idx = 0; idx < original.length; idx++) {
            twoDArray[idx / n][idx % n] = original[idx];
        }
        return twoDArray;
    }
}
