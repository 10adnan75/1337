class Solution {
    public boolean checkZeroOnes(String s) {
        return check(s, '1') > check(s, '0');
    }

    public int check(String s, char c) {
        int cnt = 0, i = 0, ans = 0;
        while (i < s.length()) {
            if (s.charAt(i) == c) {
                cnt++;
                ans = Math.max(ans, cnt);
            } else {
                cnt = 0;
            }
            i++;
        }
        return ans;
    }
}
