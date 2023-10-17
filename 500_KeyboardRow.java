class Solution {
    public Map<Character, Integer> map = new HashMap<>();

    public boolean isSameRow(String word) {
        int f = map.get(word.charAt(0));
        for (int i=1; i<word.length(); i++) {
            if (f != map.get(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public String[] findWords(String[] words) {
        for (char c: "qwertyuiop".toCharArray()) {
            map.put(c, 1);
        }
        for (char c: "asdfghjkl".toCharArray()) {
            map.put(c, 2);
        }
        for (char c: "zxcvbnm".toCharArray()) {
            map.put(c, 3);
        }
        int c = 0;
        for (int i=0; i<words.length; i++) {
            if (!isSameRow(words[i].toLowerCase())) {
                words[i] = null;
                c++;
            }
        }
        String[] ans = new String[words.length-c];
        c = 0;
        for (int i=0; i<words.length; i++) {
            if (words[i] != null) {
                ans[c++] = words[i];
            }
        }
        return ans;
    }
}
