class Solution {
    public static final int MAX = 256;
    
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p == null || s == null || s.length() == 0 || p.length() > s.length()) {
            return res;
        }
        int[] targetMap = new int[MAX];
        int[] currentMap = new int[MAX];
        for (int i=0; i<p.length(); i++) {
            targetMap[p.charAt(i)-'a']++;
            currentMap[s.charAt(i)-'a']++;
        }
        int start = 0;
        int end = p.length();
        while (end < s.length()) {
            if (isAnagram(currentMap, targetMap)) {
                res.add(start);
            }
            currentMap[s.charAt(start)-'a']--;
            start++;
            currentMap[s.charAt(end)-'a']++;
            end++;
        }
        if (isAnagram(currentMap, targetMap)) {
            res.add(start);
        }
        return res;
    }
    
    private boolean isAnagram(int[] charMap, int[] targetMap) {
        for (int i=0; i<MAX; i++) {
            if (charMap[i] != targetMap[i]) {
                return false;
            }
        }
        return true;
    }
}
