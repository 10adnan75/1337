class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        int start = 0, end = 0;
        int maxLen = 0;
        Set<Character> uniqueChars = new HashSet<>();
        while (end < s.length()) {
            if (uniqueChars.add(s.charAt(end))) {
                end++;
                maxLen = Math.max(maxLen, uniqueChars.size());
            } else {
                uniqueChars.remove(s.charAt(start));
                start++;
            }
        }
        return maxLen;
    }
}
