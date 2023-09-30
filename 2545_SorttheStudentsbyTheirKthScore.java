class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        for (int i=0; i<score.length-1; i++) {
            int j = i + 1;
            int max = score[i][k], maxIdx = i;
            while (j < score.length) {
                if (score[j][k] > max) {
                    max = score[j][k];
                    maxIdx = j;
                }
                j++;
            }
            int[] t = score[i];
            score[i] = score[maxIdx];
            score[maxIdx] = t;
        }
        return score;
    }
}
