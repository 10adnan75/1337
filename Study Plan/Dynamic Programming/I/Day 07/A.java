class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int store[] = new int[values.length];
        int max = 0;
        for (int i=0; i<values.length-1; i++) {
            max = Math.max(max, values[i]+i);
            store[i] = max;
        }
        int res = Integer.MIN_VALUE;
        for (int i=values.length-1; i>=1; i--) {
            res = Math.max(res, values[i]-i+store[i-1]);
        }
        return res;
    }
}
