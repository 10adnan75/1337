class Solution {
    public char findKthBit(int n, int k) {
        String[] bits = new String[n];
        bits[0] = "0";
        for (int i=1; i<n; i++) {
            bits[i] = bits[i-1] + "1" + helper(bits[i-1]);
        }
        return bits[n-1].charAt(k-1);
    }

    public String helper(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (c == '0') {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }
        return sb.reverse().toString();
    }
}
