class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] netTrustGains = new int[n+1];
        for (int[] i : trust) {
            netTrustGains[i[0]]--;
            netTrustGains[i[1]]++;
        }
        int judge = -1;
        for (int i=1; i<=n; i++) {
            if (netTrustGains[i] == n-1) {
                judge = i;
            }
        }
        return judge;
    }
}
