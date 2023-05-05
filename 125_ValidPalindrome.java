// My solution, 5 ms
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if ((c > 64 && c < 91) || (c > 96 && c < 123) || (c > 47 && c < 58)) {
                sb.append(c);
            } 
        }
        return sb.toString().toLowerCase().equals(sb.reverse().toString().toLowerCase());
    }
}

// Alternate approach, 3 ms
class Solution {
    public boolean isPalindrome(String s) {
        int lo = 0, hi = s.length() - 1;
        while (lo <= hi) {
            char left = s.charAt(lo);
            char right = s.charAt(hi);
            if (!Character.isLetterOrDigit(left)) {
                lo++;
            } else if (!Character.isLetterOrDigit(right)) {
                hi--;
            } else {
                if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                    return false;
                }
                lo++;
                hi--;
            }
        }
        return true;
    }
}
