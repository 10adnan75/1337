class Solution {
    public List<String> commonChars(String[] words) {
        int[][] map = new int[words.length][26];
        List<String> ans = new ArrayList<>();
        for (int i=0; i<words.length; i++) {
            for (int j=0; j<words[i].length(); j++) {
                map[i][words[i].charAt(j)-'a']++;
            }
        }
        for (int i=0; i<26; i++) {
            int min = Integer.MAX_VALUE;
            char c = (char)(i+'a'); 
            for (int j=0; j<map.length; j++) {
                min = Math.min(min, map[j][i]);
            }
            while (min-- > 0) {
                ans.add(c+"");
            }
        }
        return ans;
    }
}
