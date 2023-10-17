class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        boolean f = num < 0;
        // if (f) {
        //     num *= -1;
        // }
        num = f ? num*-1 : num;
        int n = num;
        while (n != 0) {
            ans.append(n%7);
            n /= 7;
        }
        ans.reverse();
        return f ? "-" + ans.toString() : ans.toString();
    }
}
