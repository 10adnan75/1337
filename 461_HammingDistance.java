class Solution {
    public String get(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n%2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    public int help(String a, String b, int n) {
        int c = 0;
        for (int i=0; i<n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                c++;
            }
        }
        return c;
    }

    public String modify(String s, int zeros) {
        StringBuilder sb = new StringBuilder();
        while (zeros-- > 0) {
            sb.append(0);
        }
        sb.append(s);
        return sb.toString();
    }

    public int hammingDistance(int x, int y) {
        String a = get(x), b = get(y);
        int max = Math.max(a.length(), b.length()), min = Math.min(a.length(), b.length());
        a = min == a.length() ? modify(a, max-min) : a;
        b = min == b.length() ? modify(b, max-min) : b;
        return help(a, b, max);
    }
}
