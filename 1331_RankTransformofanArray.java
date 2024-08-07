class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int rank = 1, i = 0;
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int a: arr) {
            List<Integer> l = new ArrayList<>();
            if (map.containsKey(a)) {
                l = map.get(a);
            }
            l.add(i);
            map.put(a, l);
            i++;
        }
        for (Map.Entry e: map.entrySet()) {
            List<Integer> l = (List<Integer>)e.getValue();
            for (int id: l) {
                arr[id] = rank;
            }
            rank++;
        }
        return arr;
    }
}
