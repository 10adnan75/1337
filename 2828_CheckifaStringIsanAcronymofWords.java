// 7 ms
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String acronym = "";
        for (String word : words) {
            acronym += word.charAt(0);
        }
        return s.equals(acronym);
    }
}

// 1 ms
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (s.length() != words.size()) {
            return false;
        }
        int i = 0;
        for (String word : words) {
            if (s.charAt(i++) != word.charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
