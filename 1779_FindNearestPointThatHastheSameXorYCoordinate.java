class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int nearestIdx = -1, minDist = Integer.MAX_VALUE, i = 0;
        for (int[] point: points) {
            int currDist = Math.abs(x-point[0]) + Math.abs(y-point[1]);
            if ((x == point[0] || y == point[1]) && currDist < minDist) {
                minDist = currDist;
                nearestIdx = i;
            }
            i++;
        }
        return nearestIdx;
    }
}
