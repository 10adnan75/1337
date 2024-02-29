class Solution {
    public int maxPower(String s) {
        // int i = 0, c = 1;
        // while (i < s.length()) {
        //     int j = i+1, max = 1;
        //     while (j < s.length() && s.charAt(i) == s.charAt(j)) {
        //         max++;
        //         j++;
        //     }
        //     c = Math.max(max, c);
        //     i = j;
        // }
        // return c;
        int max = 1, ans = 1;
        for (int i=0; i<s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                max++;
            } else {
                max = 1;
            }
            ans = Math.max(max, ans);
        }
        return ans;
    }
}
