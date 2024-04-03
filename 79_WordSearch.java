class Solution {
    public boolean exist(char[][] board, String word) {
        int x = board.length, y = board[0].length;
        if (x == 0 || y == 0) {
            return false;
        }
        boolean[][] map = new boolean[x][y];
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                if (dfs(board, map, i, j, x, y, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, boolean[][] map, int i, int j, int x, int y, String word, int c) {
        if (word.length() == c) {
            return true;
        }
        if (i < 0 || j < 0 || i >= x || j >= y || map[i][j] || word.charAt(c) != board[i][j]) {
            return false;
        }
        map[i][j] = true;
        boolean ans = dfs(board, map, i+1, j, x, y, word, c+1) || dfs(board, map, i, j+1, x, y, word, c+1) || dfs(board, map, i-1, j, x, y, word, c+1) || dfs(board, map, i, j-1, x, y, word, c+1);
        map[i][j] = false;
        return ans;
    }
}
