class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>(), auxMap = new HashMap<>();
        int idx = 0;
        for (String s: list1) {
            map.put(s, idx++);
        }
        idx = 0;
        for (String s: list2) {
            if (map.containsKey(s)) {
                auxMap.put(s, map.get(s)+idx);
            }
            idx++;
        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry e: auxMap.entrySet()) {
            min = Math.min(min, (int)e.getValue());
        }
        List<String> ans = new ArrayList<>();
        for (Map.Entry e: auxMap.entrySet()) {
            if ((int)e.getValue() == min) {
                ans.add((String)e.getKey());
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}
