class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int wordNumber = 1;
        for (int i=0; i<sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                wordNumber++;
                continue;
            }
            int idx = 0;
            int k = i;
            if (i > 0 && sentence.charAt(i - 1) == ' ' || i == 0) {
                while (k < sentence.length() && idx < searchWord.length() && sentence.charAt(k) == searchWord.charAt(idx)) {
                    if (idx == searchWord.length() - 1) {
                        return wordNumber;
                    }
                    idx++;
                    k++;
                }
            }
        }
        return -1;
    }
}
