class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] freq = new int[101];
        for (int num: nums) {
            freq[num]++;
            if (freq[num] == 3) {
                return false;
            }
        }
        return true;
    }
}
