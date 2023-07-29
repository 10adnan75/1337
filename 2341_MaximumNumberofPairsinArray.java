class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
        }
        int c = 0;
        for (int num : freq) {
            if ((num & 1) == 1) {
                c++;
            }
        }
        return new int[]{(nums.length - c) / 2, c};
    }
}
