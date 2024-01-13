class Solution {
    public boolean canBeEqual(String s1, String s2) {
        String one = swap(s2, 0, 2);
        String two = swap(s2, 1, 3);
        String three = swap(one, 1, 3);
        String four = swap(two, 0, 2);
        if (s1.equals(s2) || s1.equals(one) || s1.equals(two) || s1.equals(three) || s1.equals(four)) {
            return true;
        } 
        return false;
    }

    public String swap(String s, int x, int y) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if (i == x) {
                sb.append(s.charAt(y));
            } else if (i == y) {
                sb.append(s.charAt(x));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
