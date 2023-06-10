class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length + 1];
        for (int i=0; i<words.length; i++) {
            sortedWords[words[i].charAt(words[i].length() - 1) - '0'] = words[i];
        }
        for (int i=1; i<sortedWords.length; i++) {
            if (i == sortedWords.length - 1) {
                sb.append(sortedWords[i].substring(0, sortedWords[i].length() - 1));
            } else {
                sb.append(sortedWords[i].substring(0, sortedWords[i].length() - 1) + " ");
            }
            
        }
        return sb.toString();
    }
}
