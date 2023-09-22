class Solution {
    public String getSum(String s) {
        int sum = 0;
        for (int i=0; i<s.length(); i++) {
            sum += (int)s.charAt(i)-'0';
        }
        return sum + "";
    }

    public String digitSumHelper(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int j = 0;
        while (j < s.length()) {
            if (j+k > s.length()) {
                sb.append(getSum(s.substring(j, s.length())));
                // j = s.length();
                // continue;
                break;
            }
            sb.append(getSum(s.substring(j, j+k)));
            j += k;
        }
        return sb.toString();
    }

    public String digitSum(String s, int k) {
        while (true) {
            if (s.length() <= k) {
                return s;
            }
            s = digitSumHelper(s, k);
        }
    }
}
