class Solution {
    public int get(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            sb.append(s.charAt(i)-'a');
        }
        return Integer.valueOf(sb.toString());
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return get(firstWord) + get(secondWord) == get(targetWord);
    }
}
