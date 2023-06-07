class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        while (a != 0 | b != 0 | c != 0) {
            if ((c & 1) == 0) {
                flips += (a & 1) + (b & 1);
            } else {
                if ((a & 1) == 0 && (b & 1) == 0) {
                    flips++;
                }
            }
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return flips;
    }
}
