class Solution {
    public int splitNum(int num) {
        int i = num;
        int noOfDigits = 0;
        while (i != 0) {
            noOfDigits++;
            i /= 10;
        }
        int[] digits = new int[noOfDigits];
        i = 0;
        while (num != 0) {
            digits[i++] = num % 10;
            num /= 10;
        }
        Arrays.sort(digits);
        int odd = digits[1], even = digits[0];
        for (i=2; i<digits.length; i++) {
            if ((i&1) == 1) {
                odd = odd * 10 + digits[i];
            } else {
                even = even * 10 + digits[i];
            }
        }
        return odd + even;
    }
}
