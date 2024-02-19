class Solution {
    public int countKeyChanges(String s) {
        char key = Character.toLowerCase(s.charAt(0));
        int k = 0;
        for (int i=1; i<s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c != key) {
                key = c;
                k++;
            }
        }
        return k;
    }
}
