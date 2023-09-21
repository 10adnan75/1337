class Solution {
    public boolean isPalindrome(String s) {
        String r = "";
        for (int i=s.length()-1; i>=0; i--) {
            r += s.charAt(i);
        }
        return r.equals(s);
    }

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }
}
