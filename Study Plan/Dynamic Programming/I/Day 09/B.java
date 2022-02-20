class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int waterTrapped = 0;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];
        int[] minLR = new int[n];
        int ml = 0;
        int mr = 0;
        for (int i=0; i<n; i++) {
            if (i == 0) {
                maxLeft[i] = height[i];
                ml = 0;
            }
            maxLeft[i] = ml;
            if (ml < height[i]) {
                ml = height[i];
            }
        }
        for (int i=n-1; i>=0; i--) {
            if (i == n-1) {
                maxRight[i] = height[i];
                mr = 0;
            }
            maxRight[i] = mr;
            if (mr < height[i]) {
                mr = height[i];
            }
            minLR[i] = Math.min(maxLeft[i], maxRight[i]);
        }
        for (int i=0; i<n; i++) {
            int water = minLR[i] - height[i];
            if (water > 0) {
                waterTrapped += water;
            }
        }
        return waterTrapped;
    }
}
