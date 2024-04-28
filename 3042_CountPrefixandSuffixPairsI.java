class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c = 0;
        for (int i=0; i<words.length; i++) {
            for (int j=i+1; j<words.length; j++) {
                c += (isPrefixAndSuffix(words[i], words[j]) ? 1 : 0);
            }
        }
        return c;
    }

    public boolean isPrefixAndSuffix(String s1, String s2) {
        int x = s1.length(), y = s2.length();
        if (x > y) {
            return false;
        }
        return s1.equals(s2.substring(0, x)) && s1.equals(s2.substring(y-x, y));
    }
}
