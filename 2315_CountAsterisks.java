class Solution {
    public int countAsterisks(String s) {
        boolean f = true;
        int c = 0;
        for (char ch: s.toCharArray()) {
            if (ch == '|') {
                f = !f;
            }
            if (f && ch == '*') {
                c++;
            }
        }
        return c;
    }
}
