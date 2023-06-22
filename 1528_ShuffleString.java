class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chars = new char[indices.length];
        for (int i=0; i<chars.length; i++) {
            chars[indices[i]] = s.charAt(i);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        return sb.toString();
    }
}
