public class Solution {
    
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums[0] <= nums[nums.length-1]) {
            return nums[0];
        }
        return bs(nums, 0, nums.length-1);
    }
    
    private int bs(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        }
        int mid = (start + end) / 2;
        if (mid > 0 && nums[mid-1] > nums[mid]) {
            return nums[mid];
        }
        if (nums[mid] >= nums[0]) {
            return bs(nums, mid+1, end);
        } else {
            return bs(nums, start, mid-1);
        }
    }
}
