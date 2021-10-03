public class Solution {
    // you need treat n as an unsigned value
    
    // Runtime: 1 ms, Memory Usage: 38.6 MB
    public int reverseBits(int n) {
        int reverse = 0;
        for (int i=0; i<32; i++, n >>= 1) {
            reverse <<= 1;
            if ((n&1) == 1) {
                reverse++;
            }
        }
        return reverse;
    }
}
