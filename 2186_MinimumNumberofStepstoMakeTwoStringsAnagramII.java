class Solution {
    public int minSteps(String s, String t) {
        int[] freqS = new int[26], freqT = new int[26];
        boolean[] freq = new boolean[26];
        for (char c: s.toCharArray()) {
            freq[c-'a'] = true;
            freqS[c-'a']++;
        }
        for (char c: t.toCharArray()) {
            freq[c-'a'] = true;
            freqT[c-'a']++;
        }
        int steps = 0, i = 0;
        for (boolean bool: freq) {
            if (bool) {
                steps += Math.abs(freqS[i]-freqT[i]);
            }
            i++;
        }
        return steps;
    }
}
