class Solution {
    public boolean isDigit(String s) {
        for (int i=0; i<s.length(); i++) {
            int c = s.charAt(i) - '0';
            if (!(c >= 0 && c <= 9)) {
                return false;
            }
        }
        return true;
    }

    public int maximumValue(String[] strs) {
        int mx = Integer.MIN_VALUE;
        for (String str : strs) {
            if (isDigit(str)) {
                mx = Math.max(mx, Integer.valueOf(str));
            } else {
                mx = Math.max(mx, str.length());
            }
        }
        return mx;
    }
}
