// My code
// Memory: 39.7 MB, Beats 21.86%
class Solution {
    public int changeBase(int n, int k) {
        int i = 0, sum = 0;
        while (n != 0) {
            sum += Math.pow(10, i++) * (n % k); 
            n /= k;
        }
        return sum;
    }

    public int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int sumBase(int n, int k) {
        return sumDigits(changeBase(n, k));
    }
}

// Consumes less memory
// Memory: 39.1 MB, Beats 82.27%
class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        while (n != 0) {
            sum += n % k;
            n /= k;
        }
        return sum;
    }
}
