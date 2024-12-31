import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        PriorityQueue<Character> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                pq.add(c);
            }

            freq[c - 'a']++;
        }

        while (!pq.isEmpty()) {
            char ch = pq.poll();
            int count = Math.min(repeatLimit, freq[ch - 'a']);

            sb.append(String.valueOf(ch).repeat(count));
            freq[ch - 'a'] -= count;

            if (freq[ch - 'a'] > 0 && !pq.isEmpty()) {
                char ch2 = pq.poll();
                sb.append(ch2);
                freq[ch2 - 'a']--;

                if (freq[ch2 - 'a'] > 0) {
                    pq.add(ch2);
                }

                pq.add(ch);
            }
        }

        return sb.toString();
    }
}
