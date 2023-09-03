class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            String s = "";
            for (int i=0; i<word.length(); i++) {
                char c = word.charAt(i);
                if (i == word.length() - 1 && c != separator) {
                    s += c;
                    ans.add(s);
                }
                if (c == separator) {
                    if (!s.equals("")) {
                        ans.add(s);
                        s = "";
                    }
                } else {
                    s += c;
                }
            }
        }
        return ans;
    }
}
