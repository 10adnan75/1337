class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] alphabets = new boolean[26];
        for (char c : sentence.toCharArray()) {
            alphabets[c - 'a'] = true;
        }
        for (boolean bool : alphabets) {
            if (!bool) {
                return false;
            }
        }
        return true;
    }
}
