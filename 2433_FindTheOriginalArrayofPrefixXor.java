class Solution {
    public int[] findArray(int[] pref) {
        int[] xor = new int[pref.length];
        xor[0] = pref[0];
        for (int i=1; i<pref.length; i++) {
            xor[i] = pref[i-1] ^ pref[i];
        }
        return xor;
    }
}
