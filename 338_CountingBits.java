// Runtime: 5 ms
class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        for (int i=1; i<bits.length; i++) {
            int a = i;
            int count = 0;
            while (a != 0) {
                if ((a & 1) == 1) {
                    count++;
                }
                a >>= 1;
            }
            bits[i] = count;
        }
        return bits;
    }
}

// Runtime: 1 ms
class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        for (int i=1; i<=n; i++) {
            bits[i] = bits[i/2] + i % 2;
        }
        return bits;
    }
}

// Runtime: 9 ms
class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i=1; i<=n; i++) {
            int c = 0;
            int x = i;
            while (x != 0) {
                if (((x % 10) & 1) == 1) {
                    c++;
                }
                x /= 2;
            }
            ans[i] = c;
        }
        return ans;
    }
}
