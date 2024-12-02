// August 3, 2023, IND, 8:00
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

// December 2, 2024, USA, 18:18
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int index = 1;
        for (String word: sentence.split(" ")) {
            if (check(word, searchWord)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public boolean check(String s, String t) {
        int n = s.length(), m = t.length(), i = 0;
        if (m > n) {
            return false;
        }
        while (i < m) {
            if (s.charAt(i) != t.charAt(i)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
