class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> pq = new ArrayList<>();
        for (int stone: stones) {
            pq.add(stone);
        }
        while (pq.size() > 1) {
            int n = pq.size();
            Collections.sort(pq);
            int diff = pq.remove(n-1) - pq.remove(n-2);
            pq.add(diff);
        }
        return pq.get(0);
    }
}
