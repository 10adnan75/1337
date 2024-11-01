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

// October 31, 2024: Happy Halloween!
class Solution {
    public String makeFancyString(String s) {
        if (s.length() < 3) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0)).append(s.charAt(1));
        for (int i=2; i<s.length(); i++) {
            char c = s.charAt(i);
            if (s.charAt(i-1) == c && s.charAt(i-2) == c) {
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
