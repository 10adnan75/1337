class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minM = m * n, minN = m * n;
        for (int[] op: ops) {
            minM = Math.min(minM, op[0]);
            minN = Math.min(minN, op[1]);
        }
        return ops.length == 0 ? m * n : minM * minN;
    }
}
