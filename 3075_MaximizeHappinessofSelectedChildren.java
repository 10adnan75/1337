class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long maxH = 0, diff = 0;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int h: happiness) {
            pq.offer(h);
        }
        while (k-- > 0) {
            maxH += Math.max(pq.poll()-diff, 0);
            diff++;
        }
        return maxH;
    }
}
