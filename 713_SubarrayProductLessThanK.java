class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
         }
         if (k == 0) {
             return 0;
         }
         int pro = 1, res = 0;
         for (int i=0, j=0; j<nums.length; j++) {
             pro *= nums[j];
             while (i <= j && pro >= k) {
                 pro /= nums[i];
                 i++;
             }
             res += j-i+1;
         }
         return res;
    }
}

// My code: naive :(
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c = 0, i = 0;
        while (i < nums.length) {
            int j = i, prod = 1;
            while (j < nums.length) {
                prod *= nums[j];
                if (prod >= k) {
                    break;
                }
                c++;
                j++;
            }
            i++;
        }
        return c;
    }
}
