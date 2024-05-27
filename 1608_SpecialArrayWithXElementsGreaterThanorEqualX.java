class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length, size = 0;
        int[] freq = new int[1001];
        for (int num: nums) {
            size = Math.max(size, num);
            freq[num]++;
        }
        for (int i=0; i<=n; i++) {
            if (i == check(freq, i, size)) {
                return i;
            }
        }
        return -1;
    }

    public int check(int[] freq, int start, int end) {
        int c = 0;
        for (int i=start; i<=end; i++) {
            c += freq[i];
        }
        return c;
    }
}
