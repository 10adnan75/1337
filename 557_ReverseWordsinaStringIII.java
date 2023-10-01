class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for (String word : splitString(s, ' ')) {
            sb.append(getReverse(word)).append(' ');
        }
        return sb.toString().substring(0, sb.length()-1);
    }

    public String[] splitString(String s, char c) {
        int size = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == c) {
                size++;
            }
        }
        String[] ans = new String[size+1];
        size = 0;
        for (int i=0; i<ans.length; i++) {
            StringBuilder sb = new StringBuilder();
            while (size < s.length() && s.charAt(size) != c) {
                sb.append(s.charAt(size));
                size++;
            }
            size++;
            ans[i] = sb.toString();
        }
        return ans;
    }

    public String getReverse(String s) {
        char[] ans = s.toCharArray();
        int n = ans.length;
        for (int i=0; i<n/2; i++) {
            char temp = ans[i];
            ans[i] = ans[n-i-1];
            ans[n-i-1] = temp;
        }
        return new String(ans);
    }
}
