class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return null;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            String currMap = countCharacter(word);
            map.computeIfAbsent(currMap, x -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }
    
    public String countCharacter(String str) {
        int[] map = new int[26];
        for (char c : str.toCharArray()) {
            map[c-'a']++;
        }
        return Arrays.toString(map);
    }
}

// My code
class Solution {
    public String[] sortStrs(String[] strs) {
        String[] ans = new String[strs.length];
        for (int i=0; i<ans.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            ans[i] = new String(chars);
        }
        return ans;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        String[] copyStrs = sortStrs(strs);
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i=0; i<strs.length; i++) {
            String s = copyStrs[i];
            List<String> l = new ArrayList<>();
            if (map.containsKey(s)) {
                l = map.get(s);
            } 
            l.add(strs[i]);
            map.put(s, l);
        } 
        for (Map.Entry e: map.entrySet()) {
            ans.add((List<String>)e.getValue());
        }
        return ans;
    }
}
