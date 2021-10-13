class Solution {
    public boolean isAnagram(String s, String t) {
      
        // HashMap O(n) - Runtime: 11 ms, Memory: 40 MB
        /* if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for (int i=0; i<s.length(); i++) {
            char c = t.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) == 1) {
                    map.remove(c);
                } else {
                    map.put(c, map.get(c)-1);
                }
            } else {
                return false;
            }
        }
        if (map.size() > 0) {
            return false;
        }
        return true; */
        
        // Sorting O(nlgn) - Runtime: 7 ms, Memory: 39.2 MB
        /* String first = s.replaceAll(" ", "");
        String second = t.replaceAll(" ", "");
        if (first.length() != second.length()) {
            return false;
        }
        char[] stripS = first.toCharArray(), stripT = second.toCharArray();
        Arrays.sort(stripS); Arrays.sort(stripT);
        for (int i=0; i<stripS.length; i++) {
            if (stripT[i] != stripS[i]) {
                return false;
            }
        }
        return true; */
        
        // Array O(n) - Runtime: 3 ms, Memory: 39.2 MB
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i=0; i<s.length(); i++) {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
