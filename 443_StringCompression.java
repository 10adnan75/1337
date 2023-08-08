class Solution {
    public int compress(char[] chars) {
        String s = "";
        int i = 0;
        while (i < chars.length) {
            int count = 1;
            char c = chars[i];
            while (i != chars.length - 1 && c == chars[i+1]) {
                count++;
                i++;
            }
            s += c;
            if (count > 1) {
                s += count + "";
            }
            i++;
        }
        for (i=0; i<s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}
