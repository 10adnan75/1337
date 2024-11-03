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

// Nov 2, 2024, USA
class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if (n != goal.length()) {
            return false;
        }
        for (int i=1; i<=n; i++) {
            if (goal.equals(modify(s, n, i))) {
                return true;
            }
        }
        return false;
    }

    public String modify(String s, int n, int idx) {
        char[] chars = new char[n];
        for (int i=0; i<n; i++) {
            chars[(i+idx)%n] = s.charAt(i);
        }
        return new String(chars);
    }
}
