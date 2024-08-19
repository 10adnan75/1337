class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int c = 0;
        for (int i=0; i<s.length(); i++) {
            for (int j=i+1; j<=s.length(); j++) {
                if (check(s.substring(i, j), k)) {
                    c++;
                }
            }
        }
        return c;
    }

    public boolean check(String s, int k) {
        int cZero = 0, cOne = 0;
        for (char c: s.toCharArray()) {
            if (c == '0') {
                cZero++;
            } else {
                cOne++;
            }
        }
        return cZero <= k || cOne <= k;
    }
}
