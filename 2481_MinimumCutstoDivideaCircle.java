// 0 ms, 39.1 MB
class Solution {
    public int numberOfCuts(int n) {
        return n > 1 ? (n & 1) == 1 ? n : n / 2 : 0;
    }
}

// 0 ms, 39.1 MB
class Solution {
    public int numberOfCuts(int n) {
        return n == 1 ? 0 : (n & 1) == 1 ? n : n / 2;
    }
}
