class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int c = 0;
        for (int battery: batteryPercentages) {
            if (battery > c) {
                c++;
            }
        }
        return c;
    }
}
