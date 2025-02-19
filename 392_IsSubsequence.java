class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals("")) {
            return true;
        }
        if (t.equals("")) {
            return false;
        }
        int idx = 0;
        for (int i=0; i<t.length(); i++) {
            if (t.charAt(i) == s.charAt(idx)) {
                idx++;
            }
            if (idx == s.length()) {
                return true;
            }
        }
        return false;
    }
}

// Feb 18, 2025, 7:00 PM, US
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0; 
        int tPointer = 0;
        int sLen = s.length();
        int tLen = t.length();

        while (sPointer < sLen && tPointer < tLen) {
            char sChar = s.charAt(sPointer);
            char tChar = t.charAt(tPointer);

            if (sChar == tChar) {
                sPointer++;
            }

            tPointer++;
        }

        return sPointer == sLen;
    }
}
