class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i=0; i<nums.length; i+=2) {
            size += nums[i];
        }
        int[] RLElist = new int[size];
        int index = 0;
        for (int i=1; i<nums.length; i+=2) {
            int freq = nums[i-1];
            while (freq-- > 0) {
                RLElist[index++] = nums[i];
            }
        }
        return RLElist;
    }
}
