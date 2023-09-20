// My code
class Solution {
    public String largestOddNumber(String num) {
        int idx = 0;
        for (int i=num.length()-1; i>=0; i--) {
            idx = -1;
            if (((int)num.charAt(i) & 1) == 1) {
                idx = i;
                break;
            }
        }
        return idx == -1 ? "" : num.substring(0, idx+1);
    }
}

// Somewhat optimized
class Solution {
    public String largestOddNumber(String num) {
        for (int i=num.length()-1; i>=0; i--) {
            if (((int)num.charAt(i) & 1) == 1) {
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}
