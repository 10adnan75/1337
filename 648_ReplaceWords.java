// Brute force
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder sb = new StringBuilder();
        for (String word: sentence.split(" ")) {
            sb.append(getRoot(dictionary, word)).append(" ");
        }
        return sb.toString().substring(0, sb.length()-1);
    }

    public String getRoot(List<String> dictionary, String word) {
        int minL = Integer.MAX_VALUE;
        String ans = "";
        for (String root: dictionary) {
            if (isSubstring(root, word)) {
                if (root.length() < minL) {
                    minL = root.length();
                    ans = root;
                }
            }
        }
        return ans == "" ? word : ans;
    }

    public boolean isSubstring(String root, String word) {
        if (word.length() < root.length()) {
            return false;
        }
        for (int i=0; i<root.length(); i++) {
            if (root.charAt(i) != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

// Trie
