class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0, c = 0;
        int min = Integer.MAX_VALUE;
        
        for (int[] row: matrix) {
            for (int i: row) {
                if (i < 0) {
                    c++;
                }
                i = Math.abs(i);
                sum += i;
                min = Math.min(min, i);
            }
        }

        if ((c&1) == 1) {
            return sum - (2*min);
        }

        return sum;
    }
}
