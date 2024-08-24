class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0, c = capacity;
        for (int i=0; i<plants.length; i++) {
            int p = plants[i];
            if (p > c) {
                steps += ((2 * (i + 1)) - 1);
                c = capacity - p;
            } else {
                steps++;
                c -= p;
            }
        }
        return steps;
    }
}
