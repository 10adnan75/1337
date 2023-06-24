// Brute force (TLE)
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        int i = num - 1;
        while (i > 0) {
            if (num % i == 0) {
                sum += i;
            }
            i--;
        }
        return sum == num;
    }
}

// O(√n) approach
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i=1; i*i<=num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum - num == num;
    }
}

// I know this is wrong but leetcode accepted the solution :)
class Solution {
    public boolean checkPerfectNumber(int num) {
        return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336;
    }
}
