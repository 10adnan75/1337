class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        for (String s : title.split(" ")) {
            if (s.length() < 3) {
                sb.append(allLower(s));
            } else {
                sb.append(titleUpper(s));
            }
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    public String allLower(String s) {
        return s.toLowerCase();
    }

    public String titleUpper(String s) {
        StringBuilder sb = new StringBuilder(); 
        sb.append(Character.toUpperCase(s.charAt(0))).append(allLower(s.substring(1, s.length())));
        return sb.toString();
    }
}
