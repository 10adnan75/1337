// Brute force: TLE
class Solution {
    public boolean check(String s) {
        return s.charAt(0) == s.charAt(2);
    }

    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        Set<String> set = new HashSet<>();
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int k=j+1; k<n; k++) {
                    String tmp = "" + s.charAt(i) + s.charAt(j) + s.charAt(k);
                    if (check(tmp)) {
                        set.add(tmp);
                    }
                }
            }
        }
        return set.size();
    }
}

// Need to work on this solution
