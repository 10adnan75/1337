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

// Accepted :)
class Solution {
    public int numSplits(String s) {
        int n = s.length(), c = 0;
        int[][] aux = new int[n][2];
        aux[0][0] = 1; aux[n-1][1] = 1;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        for (int i=1; i<n; i++) {
            set.add(s.charAt(i));
            aux[i][0] = set.size();
        }
        set.clear();
        set.add(s.charAt(n-1));
        for (int i=n-2; i>=0; i--) {
            set.add(s.charAt(i));
            aux[i][1] = set.size();
        }
        for (int i=0; i<n-1; i++) {
            c = aux[i][0] == aux[i+1][1] ? c+1 : c;
        }
        return c;
    }
}
