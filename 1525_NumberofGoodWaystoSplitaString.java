// TLE :(
class Solution {
    public int getCount(String s) {
        Set<Character> set = new HashSet<>();
        for (char c: s.toCharArray()) {
            set.add(c);
        }
        return set.size();
    }

    public boolean checkSplits(String a, String b) {
        return getCount(a) == getCount(b);
    }

    public int numSplits(String s) {
        int n = s.length();
        int c = 0;
        for (int i=1; i<n; i++) {
            if (checkSplits(s.substring(0, i), s.substring(i, n))) {
                c++;
            }
        }
        return c;
    }
}
