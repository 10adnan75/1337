class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int score1 = 0, score2 = 0;
        int i = 0, j = 0;
        while (i < player1.length && j < player2.length) {
            score1 += ((i == 1 && player1[i-1] == 10) || i > 1 && ((player1[i-1] == 10) || (player1[i-2] == 10))) ? player1[i] * 2 : player1[i];
            score2 += ((j == 1 && player2[j-1] == 10) || j > 1 && ((player2[j-1] == 10) || (player2[j-2] == 10))) ? player2[j] * 2 : player2[j];
            i++; j++;
        }
        return score1 == score2 ? 0 : score1 > score2 ? 1 : 2;
    }
}
