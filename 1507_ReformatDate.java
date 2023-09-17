class Solution {
    public boolean check(char c) {
        return c == 't' || c == 's' || c == 'n' || c == 'r';
    }

    public String getMonth(String s) {
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int m = 0;
        for (int i=0; i<month.length; i++) {
            if (s.equals(month[i])) {
                m = i + 1;
                break;
            }
        }
        return m < 10 ? "0" + m : m + "";
    }

    public String getDate(String s) {
        return check(s.charAt(1)) ? "0" + s.charAt(0) : s.substring(0, 2);
    }

    public String reformatDate(String date) {
        int l = date.length();
        return date.substring(l-4, l) + "-" + getMonth(date.substring(l-8, l-5)) + "-" + getDate(date);
    }
}
