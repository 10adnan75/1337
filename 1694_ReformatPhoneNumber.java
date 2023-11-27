class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        for (char c: number.toCharArray()) {
            if (c >= 48 && c <= 57) {
                sb.append(c);
            }
        }
        int n = sb.length();
        if (n == 4) {
            return new String("" + sb.charAt(0) + sb.charAt(1) + "-" + sb.charAt(2) + sb.charAt(3));
        }
        if (n > 4) {
            StringBuilder ans = new StringBuilder();
            if (n % 3 == 1) {
                for (int i=0; i<n; i+=3) {
                    if (i+4 < n) {
                        ans.append(sb.substring(i, i+3) + "-");
                    }
                }
                ans.append("" + sb.charAt(n-4) + sb.charAt(n-3) + "-" + sb.charAt(n-2) + sb.charAt(n-1));
            } else {
                int i = 0;
                for (i=0; i<n; i+=3) {
                    if (i+4 < n) {
                        ans.append(sb.substring(i, i+3) + "-");
                    }
                }
                for (int k=i-3; k<n; k++) {
                    ans.append(sb.charAt(k));
                }
            }
            return ans.toString();
        }
        return sb.toString();
    }
}
