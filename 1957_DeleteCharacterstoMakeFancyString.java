class Solution {
    StringBuilder sb;

    public String makeFancyString(String s) {
        sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            int cnt = 1;
            char c = s.charAt(i);
            while (i+1 < s.length() && s.charAt(i) == s.charAt(i+1)) {
                cnt++;
                i++;
            }
            makeFancy(c, cnt);
            i++;
        }
        return sb.toString();
    }

    public void makeFancy(char c, int cnt) {
        if (cnt >= 2) {
            sb.append(c);
        } 
        sb.append(c);
    }
}
