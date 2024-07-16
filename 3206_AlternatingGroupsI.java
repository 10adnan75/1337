class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int c = 0, n = colors.length;
        for (int i=2; i<n; i++) {
            if (colors[i-2] == colors[i] && colors[i] != colors[i-1]) {
                c++;
            }
        }
        c += (colors[0] == colors[n-2] && colors[0] != colors[n-1]) ? 1 : 0;
        c += (colors[n-1] == colors[1] && colors[n-1] != colors[0]) ? 1 : 0;
        return c;
    }
}
