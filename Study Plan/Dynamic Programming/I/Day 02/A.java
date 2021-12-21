class Solution {
    
    int[] cache = new int[46];
    
    public int climbStairs(int n) {
        // Enhanced recursion - Runtime: 0 ms, Memory Usage: 37.7 MB
        /* if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int step = cache[n];
        if (step != 0) {
            return step;
        }
        step = climbStairs(n-1) + climbStairs(n-2);
        cache[n] = step;
        return step; */
        
        // Optimal memoization - Runtime: 0 ms, Memory Usage: 35.6 MB
        cache[0] = 1; cache[1] = 1;
        for (int i=2; i<=n; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[n];
    }
}
