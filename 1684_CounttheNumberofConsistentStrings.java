// Brute force
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = 0;
        for (String word : words) {
            for (int i=0; i<word.length(); i++) {
                int idx = 0;
                boolean flag = false;
                while (idx < allowed.length()) {
                    if (word.charAt(i) == allowed.charAt(idx)) {
                        flag = true;
                    }
                    idx++;
                }
                if (!flag) {
                    break;
                }
                if (i == word.length() - 1) {
                    c++;
                }
            }
        }
        return c;
    }
}

// 6 ms, Using auxiliary array (Sep 11, 2024)
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        int[] freq = new int[26];
        for (char c: allowed.toCharArray()) {
            freq[c-'a']++;
        }
        for (String word: words) {
            boolean flag = true;
            for (char c: word.toCharArray()) {
                if (freq[c-'a'] == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}