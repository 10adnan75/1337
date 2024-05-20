class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int l = password.length();
        if (l < 8) {
            return false;
        }
        boolean[] check = new boolean[4];
        for (int i=0; i<l; i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                check[0] = true;
            } else if (Character.isLowerCase(c)) {
                check[1] = true;
            } else if (Character.isDigit(c)) {
                check[2] = true;
            } else {
                check[3] = true;
            }
            if (i-1 >= 0 && i+1 < l && (password.charAt(i-1) == c || password.charAt(i+1) == c)) {
                return false;
            }
        }
        for (boolean f: check) {
            if (!f) {
                return false;
            }
        }
        return true;
    }
}
