class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area = 0;
        double diag = 0.0;
        for (int[] dimension: dimensions) {
            int currArea = dimension[0] * dimension[1];
            double currDiag = Math.sqrt(dimension[0]*dimension[0] + dimension[1]*dimension[1]);
            if (currDiag > diag) {
                diag = currDiag;
                area = currArea;
            } else if (currDiag == diag) {
                diag = currDiag;
                area = Math.max(area, currArea);
            }
        }
        return area;
    }
}
