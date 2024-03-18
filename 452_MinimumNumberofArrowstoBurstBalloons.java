class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int c = 1;
        if (points.length == 0) {
            return c;
        }
        int pos = points[0][1];
        for (int i=1; i<points.length; i++) {
            if (pos >= points[i][0]) {
                continue;
            }
            c++;
            pos = points[i][1];
        }
        return c;
    }
}
