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
