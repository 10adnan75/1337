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

// Feb 26, 2025, 1:42 PM, US
// My code
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> mergedIntervals = new ArrayList<>();
        int n = intervals.length;

        Arrays.sort(intervals, (x, y) -> x[0] - y[0]);

        for (int i=0; i<n; i++) {
            int currStartTime = intervals[i][0];
            int currEndTime = intervals[i][1];

            while ((i+1 < n) && (intervals[i+1][0] <= currEndTime || intervals[i+1][1] <= currEndTime)) {
                currEndTime = Math.max(currEndTime, intervals[i+1][1]);
                i++;
            }

            mergedIntervals.add(new int[] {currStartTime, currEndTime});
        }

        int[][] ans = new int[mergedIntervals.size()][2];
        int id = 0;

        for (int[] interval: mergedIntervals) {
            ans[id++] = interval;
        }

        return ans;
    }
}
