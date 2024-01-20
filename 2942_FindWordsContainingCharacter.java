class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        int i =  0;
        for (String word: words) {
            if (find(word, x)) {
                ans.add(i);
            }
            i++;
        }
        return ans;
    }

    public boolean find(String s, char x) {
        for (char c: s.toCharArray()) {
            if (c == x) {
                return true;
            }
        }
        return false;
    }
}
