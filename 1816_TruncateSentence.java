class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] sentence = s.split(" ");
        for (String word : sentence) {
            if (k-- > 0) {
                sb.append(word).append(" ");
            }
        }
        return sb.toString().substring(0, sb.length()-1);
    }
}
