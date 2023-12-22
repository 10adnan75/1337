class Solution {
    public int helper(String s, int i) {
        int cnt = 0;
        for (char c: s.toCharArray()) {
            if (c-'0' == i) {
                cnt++;
            }
        }
        return cnt;
    }

    public int maxScore(String s) {
        int max = 0;
        for (int i=1; i<s.length(); i++) {
            max = Math.max(max, helper(s.substring(0, i), 0) + helper(s.substring(i, s.length()), 1));
        }
        return max;
    }
}
