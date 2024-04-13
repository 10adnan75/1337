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
