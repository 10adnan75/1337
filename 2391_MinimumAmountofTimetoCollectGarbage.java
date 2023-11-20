class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int ans = 0;
        for (String g: garbage) {
            ans += g.length();
        }
        boolean M = false, P = false, G = false;
        for (int i=travel.length; i>0; i--) {
            M = M || garbage[i].contains("M");
            P = P || garbage[i].contains("P");
            G = G || garbage[i].contains("G");
            ans += travel[i-1] * ((M ? 1 : 0) + (P ? 1 : 0) + (G ? 1 : 0));
        }
        return ans;
    }
}
