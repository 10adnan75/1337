class Solution {
    public boolean isDigit(char c) {
        return (c - '0' >= 0 && c - '0' <= 9);
    }

    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        int i = 0;
        while (i < word.length()) {
            String s = "";
            boolean digit = false;
            while (i < word.length() && isDigit(word.charAt(i))) {
                if (s.equals("0")) {
                    s = "";
                }
                s += word.charAt(i) + "";
                i++;
                digit = true;
            }
            if (digit) {
                set.add(s);
                s = "";
            }
            i++;
        }
        return set.size();
    }
}
