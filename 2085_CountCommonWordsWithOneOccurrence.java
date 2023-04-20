class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (String words : words1) {
            if (!map1.containsKey(words)) {
                map1.put(words, 0);
            }
            map1.put(words, map1.get(words) + 1);
        }
        for (String words : words2) {
            if (!map2.containsKey(words)) {
                map2.put(words, 0);
            }
            map2.put(words, map2.get(words) + 1);
        }
        for (Map.Entry m : map1.entrySet()) {
            String key = (String)m.getKey();
            int value = (int)m.getValue();
            try {
                if (value == 1 && map2.get(key) == 1) {
                    count++;
                }
            } catch (Exception e) {
                continue;
            }
        }
        return count;
    }
}
