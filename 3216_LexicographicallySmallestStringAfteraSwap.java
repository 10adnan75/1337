class Solution {
    public String getSmallestString(String s) {
        int i = 0;
        boolean f = false;
        for (i=1; i<s.length(); i++) {
            if (check((int)(s.charAt(i-1))-48, (int)(s.charAt(i))-48)) {
                f = !f;
                break;
            }
        }
        if (!f) {
            return s;
        }
        char[] ans = s.toCharArray();
        char c = ans[i];
        ans[i] = ans[i-1];
        ans[i-1] = c;
        return new String(ans);
    }

    public boolean check(int x, int y) {
        return x > y && (((x&1)==1 && (y&1)==1) || ((x&1)==0 && (y&1)==0));
    }
}
