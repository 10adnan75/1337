class Solution {
    public int passThePillow(int n, int time) {
        int t = 1;
        boolean f = true;
        while (time-- > 0) {
            if (t == n || t == 1) {
                f = !f;
            }
            if (!f) {
                t++;
            }
            if (f) {
                t--;
            }
        }
        return t;
    }
}
