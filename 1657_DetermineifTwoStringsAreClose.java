class Solution {
    public Set<Character> getSet(String s) {
        Set<Character> set = new HashSet<>();
        for (char c: s.toCharArray()) {
            set.add(c);
        }
        return set;
    }

    public int[] getArray(String s) {
        int[] a = new int[26];
        for (char c: s.toCharArray()) {
            a[c-'a']++;
        }
        return a;
    }

    public String getString(int[] a) {
        Arrays.sort(a);
        StringBuilder sb = new StringBuilder();
        for (int i: a) {
            if (i != 0) {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        if (!getSet(word1).equals(getSet(word2))) {
            return false;
        }
        if (!getString(getArray(word1)).equals(getString(getArray(word2)))) {
            return false;
        }
        return true;
    }
}
