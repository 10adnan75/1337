class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        String[] rules = {"type", "color", "name"};
        int matchIndex = 0;
        for (String s : rules) {
            if (s.equals(ruleKey)) {
                break;
            }
            matchIndex++;
        }
        int count = 0;
        for (List<String> item : items) {
            if (item.get(matchIndex).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
