class Solution {
    
    public boolean canConstruct(String ransomNote, String magazine) {
        
        // HashMap O(n+m) - Runtime: 11 ms, Memory: 39.5 MB
        /* Map<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            int count = map.containsKey(c) ? map.get(c)+1 : 1;
            map.put(c, count);
        }
        for (char c : ransomNote.toCharArray()) {
            int newCount = map.containsKey(c) ? map.get(c)-1 : -1;
            if (newCount == -1) {
                return false;
            }
            map.put(c, newCount);
        }
        return true; */
        
        // Array O(n+m) - Runtime: 2 ms, Memory: 39.7 MB
        if (ransomNote == null) {
            return true;
        }
        if (magazine.length() < ransomNote.length() || magazine == null) {
            return false;
        }
        int[] count = new int[26];
        for (char c : magazine.toCharArray()) {
            count[c-'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (count[c-'a'] == 0) {
                return false;
            }
            count[c-'a']--;
        }
        return true;
    }
}
