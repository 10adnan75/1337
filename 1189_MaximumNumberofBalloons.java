class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for (int i=0; i<text.length(); i++) {
            freq[text.charAt(i)-'a']++;
        }
        return Math.min(Math.min(Math.min(freq['a'-'a'], freq['b'-'a']), freq['n'-'a']), Math.min(freq['l'-'a']/2, freq['o'-'a']/2));
    }
}
