// Brute force - 8 ms
// MH, IN
class Solution {
    public int helper(String s, int i) {
        int cnt = 0;
        for (char c: s.toCharArray()) {
            if (c-'0' == i) {
                cnt++;
            }
        }
        return cnt;
    }

    public int maxScore(String s) {
        int max = 0;
        for (int i=1; i<s.length(); i++) {
            max = Math.max(max, helper(s.substring(0, i), 0) + helper(s.substring(i, s.length()), 1));
        }
        return max;
    }
}

// Prefix sum - 1 ms
// CA, US
class Solution {
    public int maxScore(String s) {
        int max = 1, n = s.length(), zero = 0, one = 0, c = 0;
        int[] zerosFromLeft = new int[n], onesFromRight = new int[n];

        if (n == 2) {
            return s.equals("01") ? 2 : s.equals("10") ? 0 : max;
        }

        for (int i=0, j=n-1; i<n && j>=0; i++, j--) {
            c = (int) s.charAt(i) - '0';

            if (c == 0) {
                zero++;
            }

            c = (int) s.charAt(j) - '0';

            if (c == 1) {
                one++;
            }

            zerosFromLeft[i] = zero;
            onesFromRight[j] = one;
        }

        for (int i=1; i<n-1; i++) {
            max = Math.max(max, zerosFromLeft[i] + onesFromRight[i]);
        }

        return max;
    }
}
