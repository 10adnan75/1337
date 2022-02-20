class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] result = new int[m+1][n+1];
        for (int i=0; i<=m; i++) {
            result[i][0] = i;
        }
        for (int i=0; i<=n; i++) {
            result[0][i] = i;
        }
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                int min = Math.min(result[i][j-1]+1, result[i-1][j]+1);
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    min = Math.min(min, result[i-1][j-1]);
                } else {
                    min = Math.min(min, result[i-1][j-1]+1);
                }
                result[i][j] = min;
            }
        }
        return result[m][n];
    }
}
