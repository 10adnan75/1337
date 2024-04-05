class Solution {
    public String makeGood(String s) {
        int size = 0;
        do {
            size = s.length();
            for (int i=1; i<size; i++) {
                if (check(s.charAt(i), s.charAt(i-1))) {
                    s = makeGreat(s, i-1, 0); break;
                }
            }
        } while (size != s.length());
        return s;
    }

    public boolean check(char a, char b) {
        return Math.abs((int)(a-b)) == 32;
    }

    public String makeGreat(String s, int x, int i) {
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            if (i == x) {
                i += 2;
                continue;
            }
            sb.append(s.charAt(i++));
        }
        return sb.toString();
    }
}
