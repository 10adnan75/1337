class Solution {
    public int numberOfChild(int n, int k) {
        int i = -1, t = 0;
        boolean r = true, l = false;
        while (t <= k) {
            if (r) {
                if (i != n-1) {
                    i++;
                } else {
                    i--;
                    r = !r;
                    l = !l;
                }
            } else if (l) {
                if (i != 0) {
                    i--;
                } else {
                    i++;
                    r = !r;
                    l = !l;
                }
            }
            t++;
        }
        return i;
    }
}
