class Solution {
/*  public int findInsertPosition(int[] nums, int target) {
        int lo=0, hi=nums.length-1;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if (nums[mid] > target) {
                hi = mid-1;
            } else if (nums[mid] < target) {
                lo = mid+1;
            } else {
                return mid+1;
            }
        }
        return lo;
    } */  
  
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int[] arr = new int[nums.length];
        
        for (int i=nums.length-1; i>=0; i--) {
            if (Math.abs(nums[left]) > nums[right]) {
                arr[i] = nums[left] * nums[left];
                left++;
            } else {
                arr[i] = nums[right] * nums[right];
                right--;
            }
        }
        
        /* for (int i=0; i<nums.length; i++) {
            arr[findInsertPosition(arr, arr[i])] = arr[i];
        } */
        return arr;
    }
}
