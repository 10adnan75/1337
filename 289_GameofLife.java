class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[][] newState = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                newState[i][j] = getNewState(board, i, j, m, n);
            }
        }
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = newState[i][j];
            }
        }
    }

    public int getNewState(int[][] a, int i, int j, int m, int n) {
        boolean up = j-1 >= 0 ? true : false, down = j+1 < n ? true : false, right = i+1 < m ? true : false, left = i-1 >= 0 ? true : false;
        int cZero = 0, cOne = 0;
        if (left) {
            cZero += a[i-1][j] == 0 ? 1 : 0;
            cOne += a[i-1][j] == 1 ? 1 : 0;
        }
        if (right) {
            cZero += a[i+1][j] == 0 ? 1 : 0;
            cOne += a[i+1][j] == 1 ? 1 : 0;
        }
        if (up) {
            cZero += a[i][j-1] == 0 ? 1 : 0;
            cOne += a[i][j-1] == 1 ? 1 : 0;
        }
        if (down) {
            cZero += a[i][j+1] == 0 ? 1 : 0;
            cOne += a[i][j+1] == 1 ? 1 : 0;
        }
        if (left && up) {
            cZero += a[i-1][j-1] == 0 ? 1 : 0;
            cOne += a[i-1][j-1] == 1 ? 1 : 0;
        }
        if (left && down) {
            cZero += a[i-1][j+1] == 0 ? 1 : 0;
            cOne += a[i-1][j+1] == 1 ? 1 : 0;
        }
        if (right && up) {
            cZero += a[i+1][j-1] == 0 ? 1 : 0;
            cOne += a[i+1][j-1] == 1 ? 1 : 0;
        }
        if (right && down) {
            cZero += a[i+1][j+1] == 0 ? 1 : 0;
            cOne += a[i+1][j+1] == 1 ? 1 : 0;
        }
        if (a[i][j] == 1) {
            return cOne<2 || cOne>3 ? 0 : 1;
        }
        return cOne == 3 ? 1 : 0;
    }
}
