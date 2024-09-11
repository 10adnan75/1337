class Solution {
    public int minBitFlips(int start, int goal) {
        int c = 0;
        while (Math.max(start, goal) != 0) {
            if ((start&1) != (goal&1)) {
                c++;
            }
            start >>= 1;
            goal >>= 1;
        }
        return c;
    }
}
