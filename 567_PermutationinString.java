class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if (m > n) {
            return false;
        }
        StringBuilder window = new StringBuilder();
        for (int i=0; i<m; i++) {
            window.append(s2.charAt(i));
        }
        if (check(window.toString(), s1)) {
            return true;
        }
        for (int i=m; i<n-m+1; i++) {
            window.append(s2.charAt(i));
            if (check(window.toString().substring(i-m+1, i+1), s1)) {
                return true;
            }
        }
        return check(s2.substring(n-m, n), s1);
    }

    public boolean check(String a, String b) {
        int[] freq = new int[26];
        for (char c: a.toCharArray()) {
            freq[c-'a']++;
        }
        for (char c: b.toCharArray()) {
            freq[c-'a']--;
        }
        for (int i: freq) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
