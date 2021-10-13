class Solution {
    
    public boolean isValidSudoku(char[][] board) {
        
        // HashMap - Runtime: 2ms, Memory: 38.9 MB
        /* if (board == null || board.length == 0) {
            return false;
        }
        HashMap<Integer, Integer>[] rows = new HashMap[9];
        HashMap<Integer, Integer>[] cols = new HashMap[9];
        HashMap<Integer, Integer>[] boxes = new HashMap[9];
        for (int i=0; i<9; i++) {
            rows[i] = new HashMap<>();
            cols[i] = new HashMap<>();
            boxes[i] = new HashMap<>();
        }
        int number = 0;
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                char n = board[i][j];
                if (n != '.') {
                    number = (int) n;
                    int boxIdx = (i/3)*3 + j/3;
                    rows[i].put(number, rows[i].getOrDefault(number, 0)+1);
                    cols[j].put(number, cols[j].getOrDefault(number, 0)+1);
                    boxes[boxIdx].put(number, boxes[boxIdx].getOrDefault(number, 0)+1);
                    if (rows[i].get(number)>1 || cols[j].get(number)>1 || boxes[boxIdx].get(number)>1) {
                        return false;
                    }
                }
            }
        }
        return true; */
        
        // HashSet - Runtime: 2ms, Memory: 38.8 MB
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
