class Solution {
    private final Set<String> set = new HashSet<>();
    private long x = 0, y = 0;

    public int robotSim(int[] commands, int[][] obstacles) {
        long max = 0;
        boolean n = true, e = false, w = false;
        for (int[] obstacle: obstacles) {
            this.set.add(obstacle[0]+","+obstacle[1]);
        }
        for (long c: commands) {
            if (c == -1) {
                if (n) {
                    e = true;
                    n = false;
                } else if (e) {
                    e = false;
                } else if (w) {
                    n = true;
                    w = false;
                } else {
                    w = true;
                }
            } else if (c == -2) {
                if (n) {
                    w = true;
                    n = false;
                } else if (e) {
                    n = true;
                    e = false;
                } else if (w) {
                    w = false;
                } else {
                    e = true;
                }
            } else {
                if (n) {
                    getSteps(c, 0);
                } else if (e) {
                    getSteps(c, 1);
                } else if (w) {
                    getSteps(c, 2);
                } else {
                    getSteps(c, 3);
                }
                max = Math.max(max, getDistance());
            }
        }
        return (int)max;
    }

    public void getSteps(long steps, long dir) {
        long dx = 0, dy = 0;
        if (dir == 0) {
            dy = 1;
        } else if (dir == 1) {
            dx = 1;
        } else if (dir == 2) {
            dx = -1;
        } else {
            dy = -1;
        }
        while (steps-- > 0) {
            if (!set.contains((this.x+dx)+","+(this.y+dy))) {
                this.x += dx;
                this.y += dy;
            }
        }
    }

    public long getDistance() {
        return this.x*this.x + this.y*this.y;
    }
}
