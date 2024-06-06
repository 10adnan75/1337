// 4 ms
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

// 5 ms
class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        int[][] bool = new int[words.length][26];
        for (int i=0; i<words.length; i++) {
            for (int j=0; j<words[i].length(); j++) {
                bool[i][words[i].charAt(j)-'a']++;
            }
        }
        for (int i=0; i<26; i++) {
            boolean flag = false;
            int min = Integer.MAX_VALUE;
            for (int j=0; j<words.length; j++) {
                if (bool[j][i] == 0) {
                    flag = true;
                    break;
                }
                min = Math.min(min, bool[j][i]);
            }
            if (!flag) {
                while (min-- > 0) {
                    ans.add((char)(i+'a')+"");
                }
            }
        }
        return ans;
    }
}
