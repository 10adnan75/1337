class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a'] += 1;
                if (freq[c - 'a'] == 2) {
                    return true;
                }
            }
            return false;
        }
        int firstIdx = -1, secondIdx = -1;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (firstIdx == -1) {
                    firstIdx = i;
                } else if (secondIdx == -1) {
                    secondIdx = i;
                } else {
                    return false;
                }
            }
        }
        if (secondIdx == -1) {
            return false;
        }
        return s.charAt(firstIdx) == goal.charAt(secondIdx) && s.charAt(secondIdx) == goal.charAt(firstIdx);
    }
}
