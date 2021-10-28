class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seenSequences = new HashSet<>();
        Set<String> duplicateSequences = new HashSet<>();
        for (int idx=0; idx<=s.length()-10; idx++) {
            String currSequence = s.substring(idx, idx+10);
            if (!seenSequences.add(currSequence)) {
                duplicateSequences.add(currSequence);
            }
        }
        return new ArrayList<>(duplicateSequences);
    }
}
