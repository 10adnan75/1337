class Solution {
    public char getCharacter(int n) {
        return (char)(n + 96);
    }

    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            String num = "";
            if (s.charAt(i) == '#') {
                num += s.charAt(i-2) + "" + s.charAt(i-1);
                i -= 3;
            } else {
                num += s.charAt(i);
                i--;
            }
            sb.append(getCharacter(Integer.valueOf(num)));
        }
        return sb.reverse().toString();
    }
}
