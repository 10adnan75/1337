class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int max = 0, c = 0;
        for (char ch: tasks) {
            max = Math.max(max, ++freq[ch-'A']);
        }
        for (int f: freq) {
            if (f == max) {
                c++;
            }
        }
        return Math.max(tasks.length, (max-1)*(n+1)+c);
    }
}
