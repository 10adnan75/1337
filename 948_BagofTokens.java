class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int lo = 0, hi = tokens.length-1, score = 0;
        while (lo <= hi) {
            if (tokens[lo] <= power) {
                score++;
                power -= tokens[lo++];
            } else if (score > 0 && lo != hi) {
                score--;
                power += tokens[hi--];
            } else {
                break;
            }
        }
        return score;
    }
}
