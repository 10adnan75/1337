class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        String ans = new String();
        boolean flag = true;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '6' && flag) {
                ans += 9;
                flag = false;
                continue;
            }
            ans += c;
        }
        return Integer.parseInt(ans);
    }
}
