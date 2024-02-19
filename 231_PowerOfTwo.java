class Solution {
    
    public boolean isPowerOfTwo(int n) {
        
        // Naive approach - TLE
        /* while (n % 2 == 0) {
            n /= 2;
        }
        return (n == 1); */
        
        // Recursive approach - Runtime: 2 ms, Memory Usage: 38.2 MB
        /* if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n/2); */
        
        // Optimal approach - Runtime: 2 ms, Memory Usage: 38.4 MB
        return (n > 0) && (n & (n-1)) == 0; 
    }
}

// My code
class Solution {
    public boolean isPowerOfTwo(int n) {
        int i = 0;
        while (i <= n) {
            double p = Math.pow(2, i);
            if (p == n) {
                return true;
            } else if (p > n) {
                return false;
            }
            i++;
        }
        return false;
    }
}
