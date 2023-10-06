class Solution {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int partitions = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                partitions++;
                set.clear();
            }
            set.add(c);
        }
        return partitions+1;
    }
}
