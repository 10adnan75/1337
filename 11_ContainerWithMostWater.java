class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int h = Math.min(height[l], height[r]);
            ans = Math.max(ans, h*(r-l));
            if (height[l] < height[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return ans;
    }
}

// My code: TLE
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i=0; i<height.length; i++) {
            for (int j=i+1; j<height.length; j++) {
                max = Math.max(max, Math.min(height[i], height[j])*(j-i));
            }
        }
        return max;
    }
}

// My code: Optimized
