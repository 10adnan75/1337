// HashMap
class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ret = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int[] items : items1) {
            if (map.containsKey(items[0])) {
                map.put(items[0], map.get(items[0]) + items[1]);
            } else {
                map.put(items[0], items[1]);
            }
        }
        for (int[] items : items2) {
            if (map.containsKey(items[0])) {
                map.put(items[0], map.get(items[0]) + items[1]);
            } else {
                map.put(items[0], items[1]);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List<Integer> l = new ArrayList<>();
            l.add((int)entry.getKey());
            l.add((int)entry.getValue());
            ret.add(l);
        }
        return ret;
    }
}

// Array
class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] items = new int[1001];
        for (int[] item : items1) {
            items[item[0]] += item[1];
        }
        for (int[] item : items2) {
            items[item[0]] += item[1];
        }
        List<List<Integer>> ret = new ArrayList<>();
        for (int i=0; i<items.length; i++) {
            if (items[i] != 0) {
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(items[i]);
                ret.add(l);    
            }
        }
        return ret;
    }
}
