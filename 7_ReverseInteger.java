class Solution {
    public int reverse(int x) {
        long n = 0L;
        while(x != 0) {
            n = (n * 10) + (x % 10);
            x /= 10;
        }
        if(n > 2147483647) return 0;
        if(-Math.pow(2,31) <= n && n <= Math.pow(2,31)-1) return (int) n;
        return 0;
    }
}

// Sep 18, 2024
class Solution {
    public int reverse(int x) {
        boolean neg = false;
        long num = 0;
        if (x < 0) {
            neg = true;
            x *= -1;
        }
        while (x > 0) {
            int rem = x % 10;
            num = (num*10) + rem;
            x /= 10;
        }
        if (neg) {
            num *= -1;
        }
        return num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE ? (int)num : 0;
    }
}

// My code
class Solution {
    public int reverse(int x) {
        boolean neg = false;
        long num = 0;
        if (x < 0) {
            neg = true;
            x *= -1;
        }
        while (x > 0) {
            int rem = x % 10;
            num = (num*10) + rem;
            x /= 10;
        }
        if (neg) {
            num *= -1;
        }
        return num >= -2147483648 && num <= 2147483647 ? (int)num : 0;
    }
}
