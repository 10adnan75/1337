class Solution {
    public int smallestEvenMultiple(int n) {
        int sem = 1;
        if (n % 2 == 1) {
            return n * 2;
        }
        while (n != 0) {
            if (n % 2 == 1) {
                sem *= n;
                break;
            }
            sem *= 2;
            n /= 2;
        }
        return sem;
    }
}
