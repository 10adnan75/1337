// based on Sliding Window Algorithm
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

// my code: Oct 27, 2024, 9:30 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int lo = 0, hi = 0, max = 0;
        while (hi < s.length()) {
            char c = s.charAt(hi);
            if (map.containsKey(c)) {
                int i = map.get(c);
                if (i >= lo) {
                    lo = i + 1; 
                } 
            }
            map.put(c, hi);
            max = Math.max(max, hi-lo+1);
            hi++;
        }
        return max;
    }
}
