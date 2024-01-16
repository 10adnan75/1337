class Solution {
    public int remap(int n, char d) {
        char[] c = (n + "").toCharArray();
        int idx = 0, x = -1;
        if (d == '9') {
            while (idx < c.length) {
                if (c[idx] != '9') {
                    x = c[idx];
                    break;
                }
                idx++;
            }
        } else {
            x = c[0];
        }
        for (int i=0; i<c.length; i++) {
            if (c[i] == x) {
                c[i] = d;
            }
        }
        return Integer.valueOf(new String(c));
    }

    public int minMaxDifference(int num) {
        return remap(num, '9') - remap(num, '0');
    }
}
