class Solution {
    public int minLength(String s) {
        if (s.length() == 1) {
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (i == s.length() - 1) {
                sb.append(s.charAt(i++));
            }
            else if ((s.charAt(i) == 'A' && s.charAt(i+1) == 'B') || (s.charAt(i) == 'C' && s.charAt(i+1) == 'D')) {
                i += 2;
            } else {
                sb.append(s.charAt(i++));
            }
        }
        if (sb.toString().equals(s)) {
            return s.length();
        }
        return minLength(sb.toString());
    }
}
