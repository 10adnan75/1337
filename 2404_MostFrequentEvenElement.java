class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] freq = new int[1_00_001];
        for (int num : nums) {
            freq[num]++;
        }
        int maxIdx = -1, max = Integer.MIN_VALUE;
        for (int i=0; i<freq.length; i+=2) {
            if (freq[i] != 0 && freq[i] > max) {
                maxIdx = i;
                max = freq[i];
            }
        }
        return maxIdx;
    }
}
