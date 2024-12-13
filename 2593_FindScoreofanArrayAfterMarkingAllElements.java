class Solution {
    class Pair {
        int first;  
        int second; 

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public long findScore(int[] nums) {
        long ans = 0L;
        Set<Integer> set = new HashSet<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.first != b.first) return Integer.compare(a.first, b.first);
            return Integer.compare(a.second, b.second);
        });
        int i = 0, n = nums.length;
        for (int num: nums) {
            pq.add(new Pair(num, i));
            set.add(i);
            i++;
        }
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            int f = p.first, s = p.second;
            if (set.contains(s)) {
                set.remove(s);
                if (s-1 >= 0) {
                    set.remove(s-1);
                }
                if (s+1 < n) {
                    set.remove(s+1);
                }
                ans += f;
            }
        }
        return ans;
    }
}
