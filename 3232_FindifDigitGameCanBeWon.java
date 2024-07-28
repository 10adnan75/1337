class Solution {
    public boolean canAliceWin(int[] nums) {
        int totalSum = 0, singleDigitSum = 0;
        for (int num: nums) {
            totalSum += num;
            if (num <= 9) {
                singleDigitSum += num;
            }
        }
        return (totalSum - singleDigitSum) != singleDigitSum;
    }
}
