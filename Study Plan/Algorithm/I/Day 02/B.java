class Solution {
    
    // Helper function 
    public void reverse(int[] nums, int lo, int hi) {
        while (lo < hi) {
            int temp = nums[lo];
            nums[lo++] = nums[hi];
            nums[hi--] = temp;
        }
    }
    
    public void rotate(int[] nums, int k) {
        
        if (k == 0) return;
        
        // Naive approach - TC: O(nk), SC: O(1)
        /*  while (k-- > 0) {
                int last = nums[nums.length-1];
                for (int i=nums.length-1; i>0; i--) {
                    nums[i] = nums[i-1];
                }
                nums[0] = last;
            } */
        
        // Reverse trick - TC: O(n), SC: O(1)
        /*  int point = k % nums.length;
            reverse(nums, 0, nums.length-1);
            reverse(nums, 0, point-1);
            reverse(nums, point, nums.length-1); */
        
        // Extra space for auxiliary array - TC: O(n), SC: O(n)
        /*  int[] arr = new int[nums.length];
            for (int i=0; i<nums.length; i++) {
                arr[(i+k) % nums.length] = nums[i];
            }
            for (int i=0; i<nums.length; i++) {
                nums[i] = arr[i];
            } */
        
        // Two-pointer approach (cyclic replacements) - TC: O(n), SC: O(1)
        int point = k % nums.length, count = 0;
        for (int lo=0; count<nums.length; lo++) {
            int curr = lo;
            do {
                int hi = (curr + point) % nums.length;
                int temp = nums[hi]; nums[hi] = nums[lo]; nums[lo] = temp;
                curr = hi;
                count++;
            } while (lo != curr);
        }
    }         
}
