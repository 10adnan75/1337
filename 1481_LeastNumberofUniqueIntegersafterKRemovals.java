// TLE :(
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a: arr) {
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(map.values());
        while (k > 0) {
            int v = pq.poll();
            for (Map.Entry e: map.entrySet()) {
                if ((int)e.getValue() == v) {
                    if (v-k > 0) {
                        map.put((int)e.getKey(), v-k);
                        pq.offer(v-k);
                    } else {
                        map.remove(e.getKey());
                    }
                    k = v - k > 0 ? 0 : k - v;
                    break;
                }
            }
        }
        return map.size();
    }
}
