class Solution {
    public int[][] generateMatrix(int n) {
        int[][] generatedMatrix = new int[n][n];
        int k=1, top=0, bottom=n-1, left=0, right=n-1;
        while (k <= n*n) {
            for (int i=left; i<=right; i++) {
                generatedMatrix[top][i] = k;
                k++;
            }
            top++;
            for (int i=top; i<=bottom; i++) {
                generatedMatrix[i][right] = k;
                k++;
            }
            right--;
            for (int i=right; i>=left; i--) {
                generatedMatrix[bottom][i] = k;
                k++;
            }
            bottom--;
            for (int i=bottom; i>=top; i--) {
                generatedMatrix[i][left] = k;
                k++;
            }
            left++;
        }
        return generatedMatrix;
    }
}
