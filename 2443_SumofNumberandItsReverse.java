class Solution {
    public int check(String s) {
        StringBuilder sb = new StringBuilder(s);
        return Integer.valueOf(sb.reverse().toString());
    }

    public boolean sumOfNumberAndReverse(int num) {
        for (int i=0; i<=num; i++) {
            if (num == i + check(String.valueOf(i))) {
                return true;
            }
        }
        return false;
    }
}
