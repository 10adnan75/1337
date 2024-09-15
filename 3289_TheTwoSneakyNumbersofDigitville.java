class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[101], ans = new int[2];
        int i = 0;
        for (int num: nums) {
            if (freq[num] == 1) {
                ans[i++] = num;
            }
            freq[num]++;
        }
        return ans;
    }
}