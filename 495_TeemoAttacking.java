// TLE
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<timeSeries.length; i++) {
            int curr = timeSeries[i];
            if (duration > 0) {
                set.add(curr);
            }
            for (int j=curr; j<curr+duration; j++) {
                set.add(j);
            }
        }
        return set.size();
    }
}
