public class Solution {
    
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i=0; i<board.length; i++) {
            for (int j=0; j< board[0].length; j++) {
                if (dfs(board, visited, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, boolean[][] visited, int x, int y, String word, int k) {
        if (word.length() == k) {
            return true;
        }
        if (x<0 || x>=board.length || y<0 || y>=board[0].length || visited[x][y] || word.charAt(k)!=board[x][y]) {
            return false;
        }
        visited[x][y] = true;
        boolean ress = dfs(board, visited, x+1, y, word, k+1) 
                    || dfs(board, visited, x-1, y, word, k+1) 
                    || dfs(board, visited, x, y+1, word, k+1) 
                    || dfs(board, visited, x, y-1, word, k+1);
        visited[x][y] = false;
        return ress;
    }
}
