class Solution {
    
    private void collect(Map.Entry<Character, Integer> entry, StringBuilder sb) {
        int count  = entry.getValue();
        while (count-- > 0) {
            sb.append(entry.getKey());
        }
    }
    
    public String frequencySort(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(a -> collect(a, sb));
        return sb.toString();
    }
}

// My code
class Solution {
    public Character getKey(int val, Map<Character, Integer> map) {
        char key = ' ';
        for (Map.Entry e: map.entrySet()) {
            if ((int)e.getValue() == val) {
                key = (char)e.getKey();
                map.remove(key);
                break;
            }
        }
        return key;
    }

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for (Map.Entry e: map.entrySet()) {
            pq.offer((int)e.getValue());
        }
        while (!pq.isEmpty()) {
            int val = pq.poll();
            char key = getKey(val, map);
            while (val-- > 0) {
                sb.append(key);
            }
        }
        return sb.toString();
    }
}
