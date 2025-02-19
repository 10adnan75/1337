class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        int left = 1, right = 1;
        for (int i=0; i<n; i++) {
            ans[i] *= left;
            left *= nums[i];
            ans[n-1-i] *= right;
            right *= nums[n-1-i];
        }
        return ans;
    }
}

// My code
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n], right = new int[n];
        left[0] = nums[0]; right[n-1] = nums[n-1];
        for (int i=1, j=n-2; i<n && j>=0; i++, j--) {
            left[i] = nums[i] * left[i-1];
            right[j] = nums[j] * right[j+1];
        }
        nums[0] = right[1]; nums[n-1] = left[n-2];
        for (int i=1; i<n-1; i++) {
            nums[i] = left[i-1] * right[i+1];
        }
        return nums;
    }
}

// My code too, but when I am in the US, I have become somewhat pro! I miss you, Abbu <3
// Feb 18, 2025, 6:44 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int cZero = 0, prod = 1, n = nums.length, lastZero = 0;

        for (int i=0; i<n; i++) {
            if (nums[i] == 0) {
                cZero++;
                lastZero = i;
                continue;
            }

            prod *= nums[i];
        }

        if (cZero != 0) {
            for (int i=0; i<n; i++) {
                nums[i] = 0;
            }

            if (cZero == 1) {
                nums[lastZero] = prod;
            }

            return nums;
        }

        for (int i=0; i<n; i++) {
            nums[i] = prod / nums[i];
        }

        return nums;
    }
}
