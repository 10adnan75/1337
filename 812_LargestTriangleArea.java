class Solution {
    public double largestTriangleArea(int[][] points) {
        double ans = 0;
        for (int[] i: points) {
            for (int[] j: points) {
                for (int[] k: points) {
                    ans = Math.max(ans, 0.5 * Math.abs((i[0]*(j[1]-k[1])) + (j[0]*(k[1]-i[1])) + (k[0]*(i[1]-j[1]))));
                }
            }
        }
        return ans;
    }
}
