class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockWise = 0, antiClockWise = 0;
        int max = Math.max(start, destination), min = Math.min(start, destination);
        int i = 0, n = distance.length;
        for (i=min; i<max; i++) {
            clockWise += distance[i];
        }
        for (i=max; (i%n)!=min; i++) {
            antiClockWise += distance[i%n];
        }
        return clockWise > antiClockWise ? antiClockWise : clockWise;
    }
}
