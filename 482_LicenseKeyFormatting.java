class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int x = k;
        for (int i=s.length()-1; i>=0; i--) {
            char c = s.charAt(i);
            if (c == '-') {
                continue;
            }
            sb.append(c);
            if (x-- == 1) {
                sb.append("-");
                x = k;
            }
        }
        String ans = sb.reverse().toString().toUpperCase();
        if (ans.length() > 0 && ans.charAt(0) == '-') {
            return ans.substring(1, ans.length());
        }
        return ans;
    }
}
