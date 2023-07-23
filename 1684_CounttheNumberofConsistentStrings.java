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
