// ArrayList: 2 ms
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

// PriorityQueue: 1 ms
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone: stones) {
            pq.add(stone);
        }
        while (pq.size() > 1) {
            pq.offer(pq.poll() - pq.poll());
        }
        return pq.poll();
    }
}
