// Runtime: 0 ms, Beats 100%
// Memory: 39.7 MB, Beats 28.18%
class Solution {
    public int smallestEvenMultiple(int n) {
        if ((n & 1) == 1) {
            return n * 2;
        }
        return n;
    }
}

// Runtime: 0 ms, Beats 100%
// Memory: 39.4 MB, Beats 71.44%
class Solution {
    public int smallestEvenMultiple(int n) {
        int sem = 1;
        if (n % 2 == 1) {
            return n * 2;
        }
        while (n != 0) {
            if (n % 2 == 1) {
                sem *= n;
                break;
            }
            sem *= 2;
            n /= 2;
        }
        return sem;
    }
}
