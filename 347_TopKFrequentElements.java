class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }
        Map<Integer, Integer> count = new HashMap();
        for (int n: nums) {
          count.put(n, count.getOrDefault(n, 0) + 1);
        }
        Queue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> count.get(n1) - count.get(n2));
        for (int n: count.keySet()) {
          heap.add(n);
          if (heap.size() > k) heap.poll();    
        }
        int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }
        return top;
    }
}

// My code
// Feb 26, 2025, 3:30 PM, US
class Pair {
    private int key;
    private int value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return this.key;
    }

    public int getValue() {
        return this.value;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsCount = new HashMap<>();
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((x, y) -> y.getValue() - x.getValue());
        int[] ans = new int[k];

        for (int num: nums) {
            numsCount.put(num, numsCount.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e: numsCount.entrySet()) {
            priorityQueue.add(new Pair(e.getKey(), e.getValue()));
        }

        for (int i=0; i<k; i++) {
            ans[i] = priorityQueue.poll().getKey();
        }

        return ans;
    }
}
