class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        int i = 0;
        for (int[] query : queries) {
            int c = 0;
            for (int[] point : points) {
                int x = point[0] - query[0];
                int y = point[1] - query[1];
                if (Math.sqrt((x*x) + (y*y)) <= query[2]) {
                    c++;
                }
            }
            ans[i++] = c;
        }
        return ans;
    }
}
