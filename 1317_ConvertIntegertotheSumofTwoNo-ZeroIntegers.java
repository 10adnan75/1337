class Solution {
    public boolean containsZero(int a, int b) {
        while (a > 0) {
            if (a % 10 == 0) {
                return true;
            } a /= 10;
        }
        while (b > 0) {
            if (b % 10 == 0) {
                return true;
            } b /= 10;
        }
        return false;
    }

    public int[] getNoZeroIntegers(int n) {
        int A = 0, B = 0;
        for (int i=1; i<=n; i++) {
            if (!containsZero(i, n - i)) {
                A = i;
                B = n - i;
                break;
            }
        }
        return new int[]{A, B};
    }
}
