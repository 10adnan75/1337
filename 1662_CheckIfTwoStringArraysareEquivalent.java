// Concatenation
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String word : word1) {
            sb1.append(word);
        }
        for (String word : word2) {
            sb2.append(word);
        }
        return sb1.toString().equals(sb2.toString());
    }
}

// Two Pointers
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int w1 = 0, w2 = 0, left = 0, right = 0;
        while (w1 < word1.length && w2 < word2.length) {
            if (word1[w1].charAt(left++) != word2[w2].charAt(right++)) {
                return false;
            }
            if (left == word1[w1].length()) {
                w1++;
                left = 0;
            }
            if (right == word2[w2].length()) {
                w2++;
                right = 0;
            }
        }
        return w1 == word1.length && w2 == word2.length;
    }
}
