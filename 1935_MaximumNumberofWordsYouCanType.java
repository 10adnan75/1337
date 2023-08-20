class Solution {
    public boolean isBroken(String word, char c) {
        for (int i=0; i<word.length(); i++) {
            if (word.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int brokenWords = 0;
        for (String word : words) {
            for (int i=0; i<brokenLetters.length(); i++) {
                if (isBroken(word, brokenLetters.charAt(i))) {
                    brokenWords++;
                    break;
                }
            }
        }
        return words.length - brokenWords;
    }
}
