class Solution {
    public int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int differenceOfSum(int[] nums) {
        int elementSum = 0, digitsSum = 0;
        for (int i : nums) {
            elementSum += i;
            digitsSum += digitSum(i);
        }
        return Math.abs(elementSum - digitsSum);
    }
}
