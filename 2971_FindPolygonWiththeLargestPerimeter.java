// My code: naive approach (initial intuition)
class Solution {
    public long getSum(int[] nums, int end) {
        long sum = 0;
        for (int i=0; i<=end; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public long largestPerimeter(int[] nums) {
        long ans = 0;
        Arrays.sort(nums);
        for (int i=nums.length-1; i>=2; i--) {
            long sum = getSum(nums, i-1);
            if (nums[i] < sum) {
                return sum + nums[i];
            }
        }
        return -1;
    }
}

// Another approach
class Solution {
    public long largestPerimeter(int[] nums) {
        long sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
        }
        Arrays.sort(nums);
        for (int i=nums.length-1; i>=0; i--) {
            sum -= nums[i];
            if (sum > nums[i]) {
                return sum + nums[i];
            }
        }
        return -1;
    }
}
