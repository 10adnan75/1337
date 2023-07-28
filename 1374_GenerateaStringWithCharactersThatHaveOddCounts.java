class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        int l = n; 
        while (l-- > 0) {
            sb.append("a");
        }
        if ((n & 1) == 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb.append("z");
        } 
        return sb.toString();
    }
}
