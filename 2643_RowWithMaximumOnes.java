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
