class Solution {
    public int check(int n, int x, int y, String s) {
        int c = 0;
        for (int i=0; i<s.length(); i++) {
            switch(s.charAt(i)) {
                case 'L': y--; break; 
                case 'R': y++; break;
                case 'U': x--; break;
                case 'D': x++; break;
            }
            if (x>=n || y>=n || x<0 || y<0) {
                break;
            }
            c++;
        }
        return c;
    }

    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] ans = new int[s.length()];
        for (int i=0; i<ans.length; i++) {
            ans[i] = check(n, startPos[0], startPos[1], s.substring(i, s.length()));
        }
        return ans;
    }
}
