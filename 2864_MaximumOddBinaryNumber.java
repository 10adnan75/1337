class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one = -1, zero = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '1') {
                one++;
            } else {
                zero++;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (one-- > 0) {
            sb.append(1);
        }
        while (zero-- > 0) {
            sb.append(0);
        }
        sb.append(1);
        return sb.toString();
    }
}

// Another approach
class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c = -1;
        for (char ch: s.toCharArray()) {
            if (ch == '1') {
                c++;
            }
        }
        StringBuilder sb = new StringBuilder("1");
        int z = s.length() - c - 1;
        while (z-- > 0) {
            sb.append("0");
        }
        while (c-- > 0) {
            sb.append("1");
        }
        return sb.reverse().toString();
    }
}
