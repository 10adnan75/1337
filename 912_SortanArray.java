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

