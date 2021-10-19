class Solution {
    public int singleNumber(int[] nums) {
        
        int singleNo = nums[0];
        
        for(int k=1; k<nums.length; k++) {
            singleNo ^= nums[k];
        }
        
        return singleNo;
    }
}
