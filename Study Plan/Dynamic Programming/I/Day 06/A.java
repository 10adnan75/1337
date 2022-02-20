class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        int max= nums[0], min = nums[0];
        int finalmax = nums[0];
        for (int i=1; i<nums.length; i++) {
            int maxp1 = nums[i]; 
            int maxp2 = max * nums[i];
            int maxp3 = min * nums[i];
            int maxNotUpdated = max;
            max = findMax(maxp1, maxp2, maxp3);
            int minp1 = nums[i]; 
            int minp2 = maxNotUpdated * nums[i];
            int minp3 = min * nums[i];
            min = findMin(minp1, minp2, minp3);
            if (max > finalmax) {
                finalmax = max;
            }
        }
        return finalmax;
    }

    public int findMax (int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public int findMin (int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
