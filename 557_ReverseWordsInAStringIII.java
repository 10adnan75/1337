class Solution {
    
    public String reverse(String s) {
        String ans = "";
        int i = s.length()-1;
        while (i >= 0) {
            ans += s.charAt(i--);
        }
        return ans;
    }
    
    public String reverseWords(String s) {
        String ans = "";
        for (String subString : s.split(" ")) {
            ans += reverse(subString);
            ans += " ";
        }
        return ans.substring(0, ans.length()-1);
    }
}
