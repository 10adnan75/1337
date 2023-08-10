// Need to remove some minor bugs.
class Solution {
    public String greatestLetter(String s) {
        int[] letters = new int[26];
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                if (letters[c - 'A'] == 1) {
                    letters[c - 'A'] = -1;
                } else if (letters[c - 'A'] == -1) {
                    continue;
                } else {
                    letters[c - 'A'] = 1;
                }
            } else {
                if (letters[c - 'a'] == 1) {
                    letters[c - 'a'] = -1;
                } else if (letters[c - 'a'] == -1) {
                    continue;
                } else {
                    letters[c - 'a'] = 1;
                }
            }
        }
        for (int i=letters.length-1; i>=0; i--) {
            if (letters[i] == -1) {
                return (char) (i + 'A') + "";
            }
        }
        return "";
    }
}

// Using extra space.
class Solution {
    public String greatestLetter(String s) {
        int[] uc = new int[26];
        int[] lc = new int[26];
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                uc[c-'A']++;
            } else {
                lc[c-'a']++;
            }
        }
        for (int i=25; i>=0; i--) {
            if (uc[i] > 0 && lc[i] > 0) {
                return (char) (i + 'A') + "";
            }
        }
        return "";
    }
}
