class Solution {
    private int M, N;
    private int[][] smoother;

    public int makeSmooth(int[][] img, int i, int j) {
        int sum = 0, c = 1;
        if (i-1 >= 0) {
            sum += img[i-1][j];
            c++;
        }
        if (j-1 >= 0) {
            sum += img[i][j-1];
            c++;
        }
        if (i-1 >= 0 && j-1 >= 0) {
            sum += img[i-1][j-1];
            c++;
        }
        if (i+1 < M) {
            sum += img[i+1][j];
            c++;
        }
        if (j+1 < N) {
            sum += img[i][j+1];
            c++;
        }
        if (i+1 < M && j+1 < N) {
            sum += img[i+1][j+1];
            c++;
        }
        if (i-1 >= 0 && j+1 < N) {
            sum += img[i-1][j+1];
            c++;
        }
        if (i+1 < M && j-1 >= 0) {
            sum += img[i+1][j-1];
            c++;
        }
        sum += img[i][j];
        return (int)Math.floor(sum/c);
    }

    public int[][] imageSmoother(int[][] img) {
        this.M = img.length; this.N = img[0].length;
        this.smoother = new int[M][N];
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                this.smoother[i][j] = makeSmooth(img, i, j);
            }
        }
        return smoother;
    }
}
