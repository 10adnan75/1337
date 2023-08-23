// 24/52 testcases passed
// TLE at testcase #25 - 9999998
class Solution {
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

// Accepted solution
class Solution {
    public int[] constructRectangle(int area) {
        for (int i=(int)Math.sqrt(area); i>0; i--) {
            if (area % i == 0) {
                return new int[] {area / i, i};
            }
        }
        return new int[] {area, 1};
    }
}
