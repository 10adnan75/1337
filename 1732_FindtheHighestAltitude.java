class Solution {
    public int largestAltitude(int[] gain) {
        int maxAlt = 0, currAlt = 0, i = 0;
        while (i < gain.length) {
            currAlt += gain[i];
            maxAlt = Math.max(maxAlt, currAlt);
            i++;
        }
        return maxAlt;
    }
}
