// Array
// Runtime: 25 ms, Beats 16.37%
// Memory: 43.8 MB, Beats 7.21%
class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans = 0;
        while (k-- > 0) {
            Arrays.sort(gifts);
            gifts[gifts.length-1] = (int)Math.floor(Math.sqrt(gifts[gifts.length-1]));
        }
        for (int gift : gifts) {
            ans += gift;
        }
        return ans;
    }
}

// Priority Queue
// Runtime: 5 ms, Beats 88.84%
// Memory: 42.38 MB, Beats 27.43%
class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int gift: gifts) {
            pq.offer(gift);
        }
        while (k-- > 0) {
            pq.offer((int)Math.floor(Math.sqrt(pq.poll())));
        }
        long sum = 0;
        for (int gift: pq) {
            sum += gift;
        }
        return sum;
    }
}

// December 12, 2024, Seattle, WA, USA, 9:00 AM
class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum = 0L;
        PriorityQueue<Integer> priorityQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int gift: gifts) {
            priorityQ.offer(gift);
        }
        while (k-- > 0) {
            int gift = priorityQ.poll();
            priorityQ.offer((int)Math.floor(Math.sqrt(gift)));
        }
        for (int gift: priorityQ) {
            sum += gift;
        }
        return sum;
    }
}
