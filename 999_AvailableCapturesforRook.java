class Solution {
    public int numRookCaptures(char[][] board) {
        int row = 0;
        int rookR = 0, rookC = 0;
        for (char[] square : board) {
            for (int i=0; i<square.length; i++) {
                if (square[i] == 'R') {
                    rookR = row;
                    rookC = i;
                }
            }
            row++;
        }
        int c = 0;
        boolean flag = false;
        for (int i=0; i<board.length; i++) {
            if (i < rookR) {
                if (board[i][rookC] == 'p') {
                    flag = true;
                }
                if (board[i][rookC] == 'B') {
                    flag = false;
                }
            } else if (i == rookR && flag) {
                c++;
                flag = false;
            } else {
                if (board[i][rookC] == 'p') {
                    c++;
                    break;
                } else if (board[i][rookC] == 'B') {
                    break;
                }
            }
        }
        for (int i=0; i<board.length; i++) {
            if (i < rookC) {
                if (board[rookR][i] == 'p') {
                    flag = true;
                } else if (board[rookR][i] == 'B') {
                    flag = false;
                }
            } else if (i == rookC && flag) {
                c++;
            } else {
                if (board[rookR][i] == 'p') {
                    c++;
                    break;
                } else if (board[rookR][i] == 'B') {
                    break;
                }
            }
        }
        return c;
    }
}
