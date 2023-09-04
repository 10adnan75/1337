class Solution {
    public String getReverse(String word) {
        String rev = "";
        for (int i=word.length()-1; i>=0; i--) {
            rev += word.charAt(i);
        }
        return rev;
    }

    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int pairs = 0;
        for (String word : words) {
            if (set.contains(word)) {
                pairs++;
            } else {
                set.add(getReverse(word));
            }
        }
        return pairs;
    }
}
