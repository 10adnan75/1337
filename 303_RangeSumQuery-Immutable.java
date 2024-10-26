// I used brute-force here, how silly of me?
class NumArray {
    private int[] nums; 

    public NumArray(int[] nums) {
        this.nums = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            this.nums[i] = nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i=left; i<=right; i++) {
            sum += this.nums[i];
        }
        return sum;
    }
}

// prefix-sum
class NumArray {
    private int[] prefixSum;

    public NumArray(int[] nums) {
        prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i=1; i<nums.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return left == 0 ? prefixSum[right] : prefixSum[right] - prefixSum[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
