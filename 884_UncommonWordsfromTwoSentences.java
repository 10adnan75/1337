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

// Sep 17, 2024
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        for (String s: s1.split(" ")) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for (String s: s2.split(" ")) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        List<String> ans = new ArrayList<>();
        for (Map.Entry e: map.entrySet()) {
            if ((int)e.getValue() == 1) {
                ans.add((String)e.getKey());
            }
        }
        int i = 0;
        String[] uncommon = new String[ans.size()];
        for (String s: ans) {
            uncommon[i++] = s;
        }
        return uncommon;
    }
}