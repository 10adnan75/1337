class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int max = 0, c = 0;
        for (int i: nums) {
            freq[i]++;
        }
        for (int i: freq) {
            max = Math.max(max, i);
        }
        for (int i: freq) {
            if (i == max) {
                c += i;
            }
        }
        return c;
    }
}
