// My code
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

// My optimized code
class Solution {
    public String firstPalindrome(String[] words) {
        for (String word: words) {
            if (isPalindrome(word.toCharArray())) {
                return word;
            }
        }
        return "";
    }

    public boolean isPalindrome(char[] s) {
        for (int i=0; i<s.length/2; i++) {
            if (s[i] != s[s.length-i-1]) {
                return false;
            }
        }
        return true;
    }
}

// Efficacious approach
class Solution {
    public boolean isPalindrome(String s) {
        for (int i=0, j=s.length()-1; i<s.length() && j>=0; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
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
