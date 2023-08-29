// 4 ms, O(N) space
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[mat.length];
        int i = 0;
        for (int[] row : mat) {
            int c = 0;
            for (int idx : row) {
                if (idx == 1) {
                    c++;
                }
            }
            ans[i++] = c;
        }
        int max = ans[0], maxIdx = 0;
        for (i=1; i<ans.length; i++) {
            if (ans[i] > ans[maxIdx]) {
                max = ans[i];
                maxIdx = i;
            }
        }
        return new int[] {maxIdx, max};
    }
}

// 1 ms, O(1) space
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxCount = 0, maxIndex = 0;
        for (int i=0; i<mat.length; i++) {
            int c = 0;
            for (int j=0; j<mat[0].length; j++) {
                c += mat[i][j];
            }
            if (c > maxCount) {
                maxCount = c;
                maxIndex = i;
            }
        }
        return new int[] {maxIndex, maxCount};
    }
}
