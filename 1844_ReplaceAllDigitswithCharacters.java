class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if ((i & 1) == 1) {
                sb.append((char)(s.charAt(i) + s.charAt(i-1) - '0'));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
