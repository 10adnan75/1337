public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int noOf1Bits = 0;
        while (n != 0) {
            if ((n&1) == 1) {
                noOf1Bits++;
            }
            n = n >>> 1;
        }
        return noOf1Bits;
    }
}
