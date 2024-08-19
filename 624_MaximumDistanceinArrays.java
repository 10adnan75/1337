class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minIdx = 0, maxIdx = 0, i = 0;
        for (List<Integer> arr: arrays) {
            int lo = arr.get(0), hi = arr.get(arr.size()-1);
            if (lo < min) {
                minIdx = i;
                min = lo;
            }
            if (hi > max) {
                maxIdx = i;
                max = hi;
            }
            i++;
        }
        if (minIdx != maxIdx) {
            return max - min;
        }
        int sMin = Integer.MAX_VALUE, sMax = Integer.MIN_VALUE;
        i = 0;
        for (List<Integer> arr: arrays) {
            int lo = arr.get(0), hi = arr.get(arr.size()-1);
            if (lo < sMin && i != minIdx) {
                sMin = lo;
            }
            if (hi > sMax && i != maxIdx) {
                sMax = hi;
            }
            i++;
        }
        return Math.max(max-sMin, sMax-min);
    }
}
