// 4 ms
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length, i = 0, j = 0;
        int[] pos = new int[n/2], neg = new int[n/2];
        for (int num: nums) {
            if (num >= 0) {
                pos[i++] = num;
            } else {
                neg[j++] = num;
            }
        }
        i = 0; j = 0;
        int idx = 0;
        while (idx < n) {
            nums[idx++] = pos[i++];
            nums[idx++] = neg[j++];
        }
        return nums;
    }
}

// 3 ms
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0, neg = 1;
        int[] ans = new int[nums.length];
        for (int n: nums) {
            if (n > 0) {
                ans[pos] = n;
                pos += 2;
            } else {
                ans[neg] = n;
                neg += 2;
            }
        }
        return ans;
    }
}
