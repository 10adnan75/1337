class Solution {
    public int[][] pattern = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    
    public void solve(char[][] board) {
        if(board == null || board.length <= 2 || board[0].length <=2) {
            return;
        }
        int row = board.length, col = board[0].length;
        int[][] isLetterO = new int[row][col];
        for(int j=1; j<col-1; j++) {
            if(board[0][j] == 'O') {
                dfs(board, isLetterO, 1, j, row, col);
            }
            if(board[row-1][j] == 'O') {
                dfs(board, isLetterO, row - 2, j, row, col);
            }
        }
        for(int i=1; i<row-1; i++) {
            if(board[i][0] == 'O') {
                dfs(board, isLetterO, i, 1, row, col);
            }
            if(board[i][col-1] == 'O') {
                dfs(board, isLetterO, i, col - 2, row, col);
            }
        }
        for(int i=1; i<row-1; i++) {
            for(int j=1; j<col-1; j++) {
                if(isLetterO[i][j] == 0) {
                    board[i][j] = 'X';
                }
            }
        }
    }
    
    public void dfs(char[][] board, int[][] isLetterO, int x, int y, int row, int col) {
        if(x<1 || x>row-2 || y<1 || y>col-2 || board[x][y]=='X' || isLetterO[x][y]==1) {
            return;
        }
        isLetterO[x][y] = 1;
        for(int i=0; i<4; i++) {
            int nextX = x + pattern[i][0];
            int nextY = y + pattern[i][1];
            dfs(board, isLetterO, nextX, nextY, row, col);
        }
    }
}
