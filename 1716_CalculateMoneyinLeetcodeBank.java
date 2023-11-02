class Solution {
    public int totalMoney(int n) {
        int ans = 0, monday = 1;
        while (n > 0) {
            if (n >= 7) {
                for (int i=monday; i<monday+7; i++) {
                    ans += i;
                }
            } else {
                break;
            }
            monday++;
            n -= 7;
        }
        for (int i=monday; i<monday+n; i++) {
            ans += i;
        }
        return ans;
    }
}
