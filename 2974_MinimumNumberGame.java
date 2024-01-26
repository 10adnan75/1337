// 3 ms
class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n: nums) {
            pq.offer(n);
        }
        int[] ans = new int[nums.length];
        int i = 0;
        while (!pq.isEmpty()) {
            int alice = pq.poll(), bob = pq.poll();
            ans[i++] = bob;
            ans[i++] = alice;
        }
        return ans;
    }
}

// 4 ms
class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n: nums) {
            pq.offer(n);
        }
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[nums.length];
        int i = 0;
        while (!pq.isEmpty()) {
            s.push(pq.poll());
            s.push(pq.poll());
            ans[i++] = s.pop();
            ans[i++] = s.pop();
        }
        return ans;
    }
}
