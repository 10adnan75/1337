class Solution {
    public int findPermutationDifference(String s, String t) {
        int score = 0;
        for (int i=0; i<s.length(); i++) {
            for (int j=0; j<t.length(); j++) {
                if (t.charAt(j) == s.charAt(i)) {
                    score += Math.abs(i-j);
                    break;
                }
            }
        }
        return score;
    }
}
