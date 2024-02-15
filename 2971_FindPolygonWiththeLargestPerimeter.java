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
