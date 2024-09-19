class Solution {
public:
    int fib(int n) {
        return n == 0 ? 0 : n < 3 ? 1 : fib(n-1) + fib(n-2);
    }
};