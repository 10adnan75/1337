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

// Aug 1, 2024.
class Solution {
    public int countSeniors(String[] details) {
        int c = 0;
        for (String d: details) {
            if (Integer.valueOf(d.substring(11, 13)) > 60) {
                c++;
            }
        }
        return c;
    }
}
