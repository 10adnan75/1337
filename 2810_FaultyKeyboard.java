class Solution {
    public String finalString(String s) {
        String ans = "";
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'i') {
                ans = reverse(ans);
            } else {
                ans += s.charAt(i) + ""; 
            }
        }
        return ans;
    }

    public String reverse(String s) {
        String ans = "";
        for (int i=s.length()-1; i>=0; i--) {
            ans += s.charAt(i) + "";
        }
        return ans;
    }
}
