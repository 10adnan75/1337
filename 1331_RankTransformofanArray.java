// 68 ms
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

// 30 ms: Oct 2, 2024
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        int[] newArr = arr.clone();
        Arrays.sort(newArr);
        for (int a: newArr) {
            if (!map.containsKey(a)) {
                map.put(a, rank++);
            }
        }
        rank = 0;
        for (int a: arr) {
            arr[rank++] = map.get(a);
        }
        return arr;
    }
}