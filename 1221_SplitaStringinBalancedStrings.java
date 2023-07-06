class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int balance = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'R') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                ans++;
            }
        }
        return ans;
    }
}
