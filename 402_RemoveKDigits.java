// Brute Force, WA
class Solution {
    public String removeKdigits(String num, int k) {
        if (k == num.length()) {
            return "0";
        }
        long min = Integer.MAX_VALUE;
        for (int i=0; i<num.length()-k; i++) {
            min = Math.min(min, check(num, i, i+k));
        }
        return min + "";
    }

    public long check(String num, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<num.length(); i++) {
            if (i>=start && i<end) {
                continue;
            }
            sb.append(num.charAt(i));
        }
        return Long.parseLong(sb.toString());
    }
}

// Monotonic Stack, Accepted
class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if (k == n) {
            return "0";
        }
        Stack<Character> s = new Stack<>();
        for (char c: num.toCharArray()) {
            while (!s.empty() && k > 0 && s.peek() > c) {
                s.pop();
                k--;
            }
            s.push(c);
        }
        while (k-- > 0) {
            s.pop();
        }
        StringBuilder sb = new StringBuilder();
        while (!s.empty()) {
            sb.append(s.pop());
        }
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
