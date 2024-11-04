class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int n = word.length(), i = 0;
        while (i < n) {
            int c = 1, j = i+1;
            char ch = word.charAt(i);
            boolean flag = false;
            while (j < n && word.charAt(j) == ch) {
                if (c == 9) {
                    flag = true;
                    break;
                }
                c++;
                j++;
            }
            sb.append(c).append(ch);
            i = j;
        }
        return sb.toString();
    }
}
