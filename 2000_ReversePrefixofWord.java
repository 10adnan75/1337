class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int prefix = -1;
        for (int i=0; i<word.length(); i++) {
            if (ch == word.charAt(i)) {
                prefix = i;
                break;
            }
        }
        if (prefix == -1) {
            return word;
        }
        // sb.append(word.substring(0, prefix+1)).reverse();
        for (int i=prefix; i>=0; i--) {
            sb.append(word.charAt(i));
        }
        for (int i=prefix+1; i<word.length(); i++) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}

// Best solution, beats 100%
class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int prefix = -1;
        for (int i=0; i<word.length(); i++) {
            if (ch == word.charAt(i)) {
                prefix = i;
                break;
            }
        }
        sb.append(word.substring(0, prefix+1)).reverse().append(word.substring(prefix+1, word.length()));
        return prefix == -1 ? word : sb.toString();
    }
}
