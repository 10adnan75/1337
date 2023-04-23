// 1 ms, 41.9 MB
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((noOfDigits(num) & 1) == 0) {
                count++;
            }
        }
        return count;
    }
    
    public int noOfDigits(int num) {
        int digits = 0;
        while (num != 0) {
            num /= 10;
            digits++;
        }
        return digits;
    }
}

// 0 ms, 42 MB
class Solution {
    public int findNumbers(int[] nums) {
        int digits = 0;
        for (int num : nums) {
            if ((num > 9 && num < 100) || (num > 999 && num < 10000) || num == 100000) {
                digits++;
            }
        }
        return digits;
    }
}
