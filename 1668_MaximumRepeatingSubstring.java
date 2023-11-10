class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0, maxK = 0;
        int i = sequence.length();
        while (i >= word.length()) {
            if (sequence.substring(i-word.length(), i).equals(word)) {
                i -= word.length()-1;
                k++;
            } else {
                k = 0;
            }
            maxK = Math.max(maxK, k);
            i--;
        }
        i = 0; k = 0;
        while (i <= sequence.length() - word.length()) {
            if (sequence.substring(i, i+word.length()).equals(word)) {
                i += word.length()-1;
                k++;
            } else {
                k = 0;
            }
            maxK = Math.max(maxK, k);
            i++;
        }
        return maxK;
    }
}
