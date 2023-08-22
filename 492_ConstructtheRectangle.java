// 24/52 testcases passed
// TLE at testcase #25 - 9999998
Class Solution {
    public int[] constructRectangle(int area) {
        for (int l=(int)Math.sqrt(area); l<=area; l++) {
            for (int w=1; w<=Math.sqrt(area); w++) {
                if (l * w == area) {
                    return new int[]{l, w};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
         
