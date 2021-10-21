class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> {return a[0]-b[0];});
        int[][] ans = new int[intervals.length][2];
        int start = intervals[0][0], end = intervals[0][1];
        int k = 0;
        for (int i=1; i<intervals.length; i++) {
            if (end >= intervals[i][0] && end <= intervals[i][1]) {
                end = intervals[i][1];
            } else if (end < intervals[i][0]) {
                ans[k++] = new int[]{start, end};
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        ans[k++] = new int[]{start, end};
        int[][] result = new int[k][2];
        for (int i=0; i<k; i++) {
            result[i] = ans[i];
        }
        return result;
    }
}
