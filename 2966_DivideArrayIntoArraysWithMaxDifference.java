// Optimized: 24 ms
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] ans = new int[nums.length/3][3];
        Arrays.sort(nums);
        for (int i=0, j=0; i<nums.length; i+=3, j++) {
            if (nums[i+2]-nums[i] > k) {
                return new int[][] {};
            }
            ans[j][0] = nums[i];
            ans[j][1] = nums[i+1];
            ans[j][2] = nums[i+2];
        }
        return ans;
    }
}

// 126 ms
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] ans = new int[nums.length/3][3];
        int[] freq = new int[100001];
        for (int n: nums) {
            freq[n]++;
        }
        int r = 0, c = 0;
        for (int i=1; i<freq.length; i++) {
            while (freq[i]-- > 0) {
                if (c == 3) {
                    r++;
                    c = 0;
                }
                ans[r][c++] = i;
            }
        }
        for (int[] a: ans) {
            if (a[2]-a[0] > k) {
                return new int[][] {};
            }
        }
        return ans;
    }
}
