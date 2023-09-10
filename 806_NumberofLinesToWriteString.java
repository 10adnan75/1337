class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lastLine = 0, lines = 1;
        for (int i=0; i<s.length(); i++) {
            int width = widths[s.charAt(i)-'a'];
            if (width+lastLine > 100) {
                lastLine = width;
                lines++;
            } else {
                lastLine += width;
            }
        }
        return new int[] {lines, lastLine};
    }
}
