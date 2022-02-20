class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        final int LEN1 = text1.length(), LEN2 = text2.length();
        int[][] C = new int[LEN1+1][LEN2+1];
        for (int i=1; i<=LEN1; i++) {
            for (int j=1; j<=LEN2; j++) {
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    C[i][j] = C[i-1][j-1]+1;
                } else {
                    C[i][j] = C[i-1][j] > C[i][j-1] ? C[i-1][j] : C[i][j-1];
                }
            }
        }
        return C[LEN1][LEN2];     
    }
}
