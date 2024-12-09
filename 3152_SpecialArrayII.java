// Brute force, 535/536 testcases passed!
class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
        int i = 0;
        for (int[] q: queries) {
            if (check(nums, q[0], q[1])) {
                ans[i] = true;
            }
            i++;
        }
        return ans;
    }

    public boolean check(int[] nums, int start, int end) {
        boolean x = (nums[start]&1) == 1 ? false : true;
        for (int i=start+1; i<=end; i++) {
            if (x && (nums[i]&1) == 0) {
                return false;
            }
            if (!x && (nums[i]&1) == 1) {
                return false;
            }
            x = !x;
        }
        return true;
    }
}

// Another wrong implementation that needs to be fixed!
class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        if (n == 1) {
            return new boolean[]{true};
        }
        boolean[] special = new boolean[n], ans = new boolean[queries.length];
        int x = nums[0], y = nums[1], id = 0;
        if ((x&1) != (y&1)) {
            special[0] = true;
        }
        x = nums[n-1]; y = nums[n-2];
        if ((x&1) != (y&1)) {
            special[n-1] = true;
        }
        for (int i=1; i<n-1; i++) {
            int left = nums[i-1]&1, right = nums[i+1]&1, curr = nums[i]&1;
            if (left == right && left != curr) {
                special[i] = true;
            }
        }
        for (int[] q: queries) {
            ans[id++] = check(special, q[0], q[1]);
        }
        return ans;
    }

    public boolean check(boolean[] arr, int start, int end) {
        for (int i=start+1; i<=end; i++) {
            if (!arr[i]) {
                return false;
            }
        }
        return true;
    }
}
