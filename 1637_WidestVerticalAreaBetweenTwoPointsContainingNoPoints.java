class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max = 0;
        int[] x = new int[points.length];
        int i = 0;
        for (int[] point : points) {
            x[i++] = point[0];
        }
        Arrays.sort(x);
        for (i=1; i<x.length; i++) {
            max = Math.max(max, (x[i]-x[i-1]));
        }
        return max;
    }
}
