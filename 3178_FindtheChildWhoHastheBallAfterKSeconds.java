// Simulation: My code (Naive)
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

// Efficacious approach
class Solution {
    public int numberOfChild(int n, int k) {
        int pos = 0, dir = 1;
        for (int i=0; i<k; i++) {
            if (pos == 0 && dir == -1) {
                dir = 1;
            } else if (pos == n-1 && dir == 1) {
                dir = -1;
            }
            pos += dir;
        }
        return pos;
    }
}
