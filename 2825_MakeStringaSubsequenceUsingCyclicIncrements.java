class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int[] freq = new int[26];
        for (char c: str1.toCharArray()) {
            freq[c-'a']++;
        }
        for (int i=0; i<str2.length(); i++) {
            char c = str2.charAt(i);
            if (freq[c-'a'] == 0) {
                int id = c-'a'-1;
                id = id == -1 ? 25 : id;
                if (freq[id] == 0) {
                    return false;
                }
                freq[id]--;
            } else {
                freq[c-'a']--;
            }
        }
        return true;
    }
}
