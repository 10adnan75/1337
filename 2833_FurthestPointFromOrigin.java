class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int right = 0, left = 0; 
        for (int i=0; i<moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                right++;
            }
            if (moves.charAt(i) == 'L') {
                left++;
            }
        }
        return Math.abs(right-left) + moves.length() - (right + left);
    }
}
