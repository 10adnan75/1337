// This chunk of code works only for non-negative input
/*
class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int[] sortedArr = new int[n];
        int[] frequency = new int[50001];
        for (int i : nums) {
            frequency[i]++;
        }
        int idx = 0;
        for (int i=0; i<50001; i++) {
            if (frequency[i] == 0) {
                continue;
            }
            while (frequency[i]-- > 0) {
                sortedArr[idx++] = i;
            }
        }
        return sortedArr;
    }
}
*/

// Fixed the above code; Solution accepted :)
class Solution {
    public int[] sortArray(int[] nums) {
        int[] freq = new int[100001];
        for (int i : nums) {
            freq[i+50000]++;
        }
        for (int i=0, idx=0; i<100001; i++) {
            while (freq[i]-- > 0) {
                nums[idx++] = i-50000;
            }
        }
        return nums;
    }
}
