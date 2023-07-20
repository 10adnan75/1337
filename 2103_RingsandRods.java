class Solution {
    public int countPoints(String rings) {
        int c = 0;
        int n = rings.length() / 2;
        boolean[][] rods = new boolean[10][3];
        int i = 0;
        while (i < rings.length()) {
            if (rings.charAt(i) == 'R') {
                rods[rings.charAt(i+1) - '0'][0] = true;
            } else if ((rings.charAt(i) == 'G')) {
                rods[rings.charAt(i+1) - '0'][1] = true;
            } else {
                rods[rings.charAt(i+1) - '0'][2] = true;
            }
            i += 2;
        }
        for (i=0; i<rods.length; i++) {
            if (rods[i][0] && rods[i][1] && rods[i][2]) {
                c++;
            }
        }
        return c;
    }
}
