class Solution {
    public char repeatedCharacter(String s) {
        int[] chars = new int[26];
        for (int i=0; i<s.length(); i++) {
            char x = s.charAt(i);
            if (chars[x - 'a'] > 0) {
                return x;
            }
            chars[x - 'a']++;
        }
        return '0';
    }
}
