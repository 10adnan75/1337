class Solution {
    
    public int findTheWinner(int n, int k) {
        return 1 + helper(n, k);
    }
    
    private int helper(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (helper(n-1, k) + k) % n;
    }
}
