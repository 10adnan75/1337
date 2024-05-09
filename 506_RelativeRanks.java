// Auxiliary array
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] aux = new int[n];
        for (int i=0; i<n; i++) {
            aux[i] = score[i];
        }
        Arrays.sort(aux);
        String[] ans = new String[n];
        Map<Integer, String> map = new HashMap<>();
        int idx = 4;
        for (int i=n-1; i>=0; i--) {
            if (i == n-1) {
                map.put(aux[n-1], "Gold Medal");
            } else if (i == n-2) {
                map.put(aux[n-2], "Silver Medal");
            } else if (i == n-3) {
                map.put(aux[n-3], "Bronze Medal");
            } else {
                map.put(aux[i], (idx++)+"");
            }
        }
        for (int i=0; i<n; i++) {
            ans[i] = map.get(score[i]);
        }
        return ans;
    }
}

// Priority queue
class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (int s: score) {
            pq.add(s);
            map.put(s, i++);
        }
        i = 0;
        while (i < 3 && !pq.isEmpty()) {
            ans[map.get(pq.poll())] = i == 0 ? "Gold Medal" : i == 1 ? "Silver Medal" : "Bronze Medal";
            i++;
        }
        while (!pq.isEmpty()) {
            ans[map.get(pq.poll())] = ++i+"";
        }
        return ans;
    }
}
