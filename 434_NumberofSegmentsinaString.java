class Solution {
    public int countSegments(String s) {
        int c = 0;
        for (String st : s.split(" ")) {
            if (!st.equals("")) {
                c++;
            }
        }
        return c;
    }
}
