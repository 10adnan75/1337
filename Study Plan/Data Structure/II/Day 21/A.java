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
