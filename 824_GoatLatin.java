class Solution {
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public String toGoatLatin(String sentence) {
        int countOfA = 1;
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" "); 
        for (int i=0; i<words.length; i++) {
            if (isVowel(words[i].charAt(0))) {
                sb.append(words[i]).append("ma");
            } else {
                sb.append(words[i].substring(1, words[i].length())).append(words[i].charAt(0)).append("ma");
            }
            int currCount = countOfA;
            while (currCount-- > 0) {
                sb.append('a');
            }
            countOfA++;
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
