class Solution {
    public int arraySign(int[] nums) {
        int negCount = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } 
            if (nums[i] < 0) {
                negCount++;
            }
        }
        return (negCount & 1) == 1 ? -1 : 1;
    }
}
