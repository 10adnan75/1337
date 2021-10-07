class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i=0; i<9; i++) {
            Set<Character> rows = new HashSet<>();
            Set<Character> columns = new HashSet<>();
            Set<Character> cube = new HashSet<>();
            for (int j=0; j<9; j++) {
                if (board[i][j] != '.' && !rows.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !columns.add(board[j][i])) {
                    return false;
                }
                int rowIdx = 3*(i/3);
                int colIdx = 3*(i%3);
                if (board[rowIdx+j/3][colIdx+j%3] != '.' && !cube.add(board[rowIdx+j/3][colIdx+j%3])) {
                    return false;
                }
            }
        }
        return true;
    }
}
