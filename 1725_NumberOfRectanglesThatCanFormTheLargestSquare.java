class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int[] p : rectangles) {
            int key = Math.min(p[0], p[1]);
            max = Math.max(max, key);
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        return map.get(max);
    }
}
