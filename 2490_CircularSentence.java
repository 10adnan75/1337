// silly me -_-
// 2 ms, 41.4 MB
class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int i = 0;
        for (i=0; i<words.length-1; i++) {
            String a = words[i], b = words[i+1];
            if (a.charAt(a.length()-1) != b.charAt(0)) {
                return false;
            }
        }
        return words[i].charAt(words[i].length()-1) == words[0].charAt(0);
    }
}

// 1 ms, 40.8 MB
class Solution {
    public boolean isCircularSentence(String sentence) {
        for (int i=0; i<sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                if (sentence.charAt(i-1) != sentence.charAt(i+1)) {
                    return false;
                }
            }
        }
        return sentence.charAt(sentence.length()-1) == sentence.charAt(0);
    }
}
