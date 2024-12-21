// India
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int min = Math.min(word1.length(), word2.length());
        int i = 0, j = 0;
        for (int idx=0; idx<min*2; idx++) {
            if ((idx & 1) == 1) {
                sb.append(word2.charAt(j++));
            } else {
                sb.append(word1.charAt(i++));
            }
        }
        return min == word1.length() ? sb.append(word2.substring(min, word2.length())).toString() : sb.append(word1.substring(min, word1.length())).toString();
    }
}

// United States
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++)).append(word2.charAt(j++));
        }
        while (i < word1.length()) {
            sb.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }
}
