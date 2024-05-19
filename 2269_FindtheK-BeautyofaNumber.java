class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = num + "";
        int c = 0;
        for (int i=0; i<=s.length()-k; i++) {
            if (check(num, Integer.parseInt(s.substring(i, i+k)))) {
                c++;
            }
        }
        return c;
    }

    public boolean check(int n, int k) {
        return k == 0 ? false : n % k == 0;
    }
}
