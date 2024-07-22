// Reverse Sorting
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i=0; i<heights.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        sortPeopleDesc(heights);
        for (int i=0; i<names.length; i++) {
            names[i] = map.get(heights[i]);
        }
        return names;
    }

    public void sortPeopleDesc(int[] a) {
        int start = 0, end = a.length - 1;
        for (int i=0; i<a.length/2; i++) {
            int temp = a[start];
            a[start++] = a[end];
            a[end--] = temp;
        }
    }
}

// Priority Queue
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int i = 0, n = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();
        for (i=0; i<n; i++) {
            map.put(heights[i], i);
            pq.offer(heights[i]);
        }
        i = 0;
        String[] ans = new String[n];
        while (!pq.isEmpty()) {
            ans[i++] = names[map.get(pq.poll())];
        }
        return ans;
    }
}
