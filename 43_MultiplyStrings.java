class Solution {
    public String multiply(String num1, String num2) {
        String n1 = new StringBuilder(num1).reverse().toString();
        String n2 = new StringBuilder(num2).reverse().toString();
        int[] digit = new int[num1.length()+num2.length()];
        for (int i=0; i<n1.length(); i++) {
            for (int j=0; j<n2.length(); j++) {
                digit[i+j] += (n1.charAt(i)-'0') * (n2.charAt(j)-'0');
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i=0; i<digit.length; i++) {
            int mod = digit[i] % 10;
            int carry = digit[i] / 10;
            if (i+1 < digit.length) {
                digit[i+1] += carry;
            }
            ans.insert(0, mod);
        }
        while (ans.charAt(0) == '0' && ans.length() > 1) {
            ans.deleteCharAt(0);
        }
        return ans.toString();
    }
}
