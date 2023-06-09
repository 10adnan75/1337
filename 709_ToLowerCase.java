class Solution {
    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                str.append((char)(s.charAt(i) + 'a' - 'A'));
            } else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
