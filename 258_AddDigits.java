// Trivial
class Solution {
    public int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int addDigits(int num) {
        while (num > 9) {
            num = sumDigits(num);
        }
        return num;
    }
}

// Maths :)
class Solution {
    public int addDigits(int num) {
        return num == 0 ? 0 : num % 9 == 0 ? 9 : num % 9;
    }
}
