class Solution {
    public boolean checkString(String s) {
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'b' && i != s.length() - 1 && s.charAt(i+1) == 'a') {
                return false;
            }
        }
        return true;
    }
}
