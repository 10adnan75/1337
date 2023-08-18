class Solution {
    public String getDifference(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<word.length(); i++) {
            sb.append((word.charAt(i) - 'a') - (word.charAt(i-1) - 'a')).append(" ");
        }
        return sb.toString();
    }

    public String oddString(String[] words) {
        // Map<String, int[]> map = new HashMap<>();
        // for (String word : words) {
        //     map.put(word, getDifferenceArr(word));
        // }
        // for (Map.Entry entry : map.entrySet()) {
        //     System.out.print(entry.getKey() + " -> ");
        //     for (int i : (int[])entry.getValue()) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }
        Map<String, Integer> map = new HashMap<>();
        Map<String, String> ans = new HashMap<>();
        for (String word : words) {
            String s = getDifference(word);
            map.put(s, map.getOrDefault(s, 0) + 1);
            ans.put(s, word);
        }
        for (Map.Entry entry : map.entrySet()) {
            if ((int)entry.getValue() == 1) {
                return ans.get(entry.getKey());
            }
        }
        return "";
    }
}
