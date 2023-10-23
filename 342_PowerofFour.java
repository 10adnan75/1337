// Iteration: 1 ms
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        } 
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }
}

// Recursion: 0 ms
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 4 == 0) {
            return isPowerOfFour(n/4);
        }
        return false;
    }
}
