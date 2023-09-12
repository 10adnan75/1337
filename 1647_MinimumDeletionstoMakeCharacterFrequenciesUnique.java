class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        Set<Integer> set = new HashSet<>();
        int minDeletions = 0;
        for (int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }
        for (int i : freq) {
            while (i!=0 && set.contains(i)) {
                i--;
                minDeletions++;
            }
            if (i > 0) {
                set.add(i);
            }
        }
        return minDeletions;
    }
}
