class Solution {
    public int possibleStringCount(String word) {
        int i = 0, c = 1, n = word.length();
        while (i < n) {
            char ch = word.charAt(i);
            int j = i + 1;
            while (j < n && word.charAt(j) == ch) {
                c++;
                j++;
            }
            i = j;
        }
        return c;
    }
}
