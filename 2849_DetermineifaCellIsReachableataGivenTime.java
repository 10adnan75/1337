class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int h = Math.abs(sy-fy), w = Math.abs(sx-fx);
        if (h == 0 && w == 0 && t == 1) {
            return false;
        }
        return t >= Math.max(h, w);
    }
}
