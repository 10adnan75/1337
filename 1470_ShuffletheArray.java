// Runtime: 0 ms, Beats 100%
// Memory: 43.2 MB, Beats 7.88%
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        int x = 0, y = n;
        for (int i=0; i<ans.length; i++) {
            if (i % 2 == 0) {
                ans[i] = nums[x++];
            } else {
                ans[i] = nums[y++];
            }
        }
        return ans;
    }
}

// Runtime: 0 ms, Beats 100%
// Memory: 43.1 MB, Beats 11.97%
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        for (int i=0, j=0, k=n; i<ans.length; i+=2, j++, k++) {
            ans[i] = nums[j];
            ans[i+1] = nums[k];
        }
        return ans;
    }
}
