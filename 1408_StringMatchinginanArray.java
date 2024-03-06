class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();
        for (int i=0; i<words.length; i++) {
            for (int j=0; j<words.length; j++) {
                if (i != j && words[i].length() <= words[j].length() && check(words[i], words[j])) {
                    set.add(words[i]);
                }
            }
        }
        return new ArrayList<String>(set);
    }

    public boolean check(String a, String b) {
        for (int i=0; i<b.length()-a.length()+1; i++) {
            int j = 0;
            for (j=0; j<a.length(); j++) {
                if (a.charAt(j) != b.charAt(i+j)) {
                    break;
                }
            }
            if (j == a.length()) {
                return true;
            }
        }
        return false;
    }
}
