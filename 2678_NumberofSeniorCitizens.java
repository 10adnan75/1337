class Solution {
    public int getAge(String s) {
        return Integer.valueOf(s.charAt(11) + "" + s.charAt(12));
    } 

    public int countSeniors(String[] details) {
        int c = 0;
        for (String detail : details) {
            if (getAge(detail) > 60) {
                c++;
            }
        }
        return c;
    }
}
