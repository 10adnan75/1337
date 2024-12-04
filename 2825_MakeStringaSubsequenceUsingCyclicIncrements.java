// Failing testcase:
// Input: str1 = "cabc", str2 = "add"
// Output: false
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

// Accepted
class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        while (i < str1.length() && j < str2.length()) {
            char c = str1.charAt(i), d = str2.charAt(j);
            if (c == d || c+1 == d || (c == 'z' && d == 'a')) {
                j++;
            }
            i++;
        }
        return j == str2.length();
    }
}
