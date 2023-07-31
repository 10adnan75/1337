class Solution {
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
 
        if (n == 2 || n == 3) {
            return true;
        }
 
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i=5; i<=Math.sqrt(n); i+=6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public int diagonalPrime(int[][] nums) {
        int prime = 0;
        for (int i=0, j=nums.length-1; i<nums.length && j>=0; i++, j--) {
            if (isPrime(nums[i][i])) {
                prime = Math.max(prime, nums[i][i]);
            }
            if (isPrime(nums[i][j])) {
                prime = Math.max(prime, nums[i][j]);
            }
        }
        return prime;
    }
}
