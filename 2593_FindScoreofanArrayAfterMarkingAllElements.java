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

// Credits: Sameer Mirza
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    private final Map<Integer, PriorityQueue<Integer>> valueToIndicesMap = new HashMap<>();
    private final PriorityQueue<Integer> numPriorityQueue = new PriorityQueue<>();

    public long findScore(int[] nums) {
        int n = nums.length, i = 0;
        long ans = 0L;
        boolean[] markedIndices = new boolean[n];

        for (int num : nums) {
            this.numPriorityQueue.add(num);
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            if (this.valueToIndicesMap.containsKey(num)) {
                priorityQueue = this.valueToIndicesMap.get(num);
            }
            priorityQueue.add(i);
            this.valueToIndicesMap.put(num, priorityQueue);
            i++;
        }

        while (!this.numPriorityQueue.isEmpty()) {
            int number = this.numPriorityQueue.poll();
            if (this.valueToIndicesMap.containsKey(number)) {
                PriorityQueue<Integer> priorityQueue = this.valueToIndicesMap.get(number);
                if (!priorityQueue.isEmpty()) {
                    int index = priorityQueue.poll();
                    if (!markedIndices[index]) {
                        ans += nums[index];
                        markedIndices[index] = true;
                        if (index-1 >= 0) markedIndices[index-1] = true;
                        if (index+1 < n) markedIndices[index+1] = true;
                    }
                }
            }
        }

        return ans;
    }
}
