// My solution, 1 ms;
class Solution {
    public boolean isLetter(char c) {
        return (c > 64 && c < 91) || (c > 96 && c < 123);
    }

    public String getReversed(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1; i>-1; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if (isLetter(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        String rev = getReversed(sb.toString());
        int revIdx = 0;
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isLetter(c)) {
                ans.append(rev.charAt(revIdx++));
            } else {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}

// Using a stack, 2 ms;
class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> letters = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(letters.pop());
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
