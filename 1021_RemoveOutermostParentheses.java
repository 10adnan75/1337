class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int cLeft = 0, cRight = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' && cLeft == cRight) {
                cLeft++;
            } else {
                if (c == ')') { 
                    cRight++; 
                } else {
                    cLeft++;
                }
                if (cLeft != cRight) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
