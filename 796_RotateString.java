class Solution {
    public static String shift(String s, int k) {
        char[] ans = new char[s.length()];
        for (int i=0; i<s.length(); i++) {
            int idx = i + k;
            if (idx >= s.length()) {
                ans[Math.abs(s.length()-idx)] = s.charAt(i);
            } else {
                ans[idx] = s.charAt(i);
            }
        }
        return new String(ans);
    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        Set<String> set = new HashSet<>();
        for (int i=0; i<s.length(); i++) {
            set.add(shift(s, i));
        }
        for (String scored : set) {
            if (goal.equals(scored)) {
                return true;
            }
        }
        return false;
    }
}
