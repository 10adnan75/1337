class Solution {
    public boolean isHappy(int n) {
        Set<Integer> history = new HashSet<>();
        while (!history.contains(n)) {
            int tmp = sumOfDigits(n);
            history.add(n);
            if (tmp == 1) {
                return true;
            }
            n = tmp;
        }
        return false;
    }

    public int sumOfDigits(int n) {
        int result = 0;
        while (n != 0) {
            result += Math.pow(n % 10, 2);
            n /= 10;
        }
        return result;
    }
}
