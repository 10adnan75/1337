// Hash set: 32 ms
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

// Counter array: 8 ms
class Solution {
    public int partitionString(String s) {
        boolean[] freq = new boolean[26];
        int partitions = 1;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c-'a']) {
                partitions++;
                freq = new boolean[26];
            }
            freq[c-'a'] = true;
        }
        return partitions;
    }
}
