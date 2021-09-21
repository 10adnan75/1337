class Solution { 
    public void reverse(int[] nums, int lo, int hi) {
        while (lo < hi) {
            int temp = nums[lo];
            nums[lo++] = nums[hi];
            nums[hi--] = temp;
        }
    }
    
    public void rotate(int[] nums, int k) {
        int point = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, point-1);
        reverse(nums, point, nums.length-1); 
    }         
}
