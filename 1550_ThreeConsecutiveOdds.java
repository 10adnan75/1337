class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c = 0;
        for (int a : arr) {
            if ((a & 1) == 1) {
                c++;
            } else {
                c = 0;
            }
            if (c == 3) {
                return true;
            }
        }
        return false;
    }
}
