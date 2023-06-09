class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char letter = letters[0];
        int lo = 0, hi = letters.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (letters[mid] > target) {
                letter = letters[mid];
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return letter;
    }
}
