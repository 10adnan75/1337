class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> l = new ArrayList<>();
        for (String s : s1.split(" ")) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for (String s : s2.split(" ")) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for (Map.Entry entry : map.entrySet()) {
            if ((int)entry.getValue() == 1) {
                l.add((String)entry.getKey());
            }
        }
        String[] ans = new String[l.size()];
        for (int i=0; i<l.size(); i++) {
            ans[i] = l.get(i);
        }
        return ans;
    }
}
