/*
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();
        for (int i=0, j=0; i<word1.length(); i++, j++) {
            char alpha1 = word1.charAt(i), alpha2 = word2.charAt(i);
            if (m1.containsKey(alpha1)) {
                m1.put(alpha1, m1.get(alpha1) + 1);
            } else {
                m1.put(alpha1, 1);
            }
            if (m2.containsKey(alpha2)) {
                m2.put(alpha2, m2.get(alpha2) + 1);
            } else {
                m2.put(alpha2, 1);
            }
        }
        for (Map.Entry m : m1.entrySet()) {
            char key = (char) m.getKey();
            if (!m2.containsKey(key)) {
                m2.put(key, 0);
            }
        }
        
        for (Map.Entry m : m2.entrySet()) {
            char key = (char) m.getKey();
            if (!m1.containsKey(key)) {
                m1.put(key, 0);
            }
        }
        int value1, value2;
        for (Map.Entry m : m1.entrySet()) {
            if (m2.get(m.getKey()) == null) {
                value1 = 0;
            } else {
                value1 = m2.get(m.getKey());
            }
            if (m.getValue() == null) {
                value2 = 0;
            } else {
                value2 = (int)m.getValue();
            }
            if (Math.abs(value1 - value2) > 3) {
                return false;
            }
        }
        return true;
    }
}
*/

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] alpha = new int[26];
        int len = word2.length();
        for (int i=0; i<len; i++) {
            alpha[word2.charAt(i) - 'a']++;
            alpha[word1.charAt(i) - 'a']--;
        }
        for (int i : alpha) {
            if (Math.abs(i) > 3) {
                return false;
            }
        }
        return true;
    }
}
