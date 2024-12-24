import java.util.HashMap;
import java.util.Map;

class Solution {
    public String reverseWords(String s) {
        Map<Integer, String> wordsIndex = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;

        for (String str: s.split(" ")) {
            if (!str.isEmpty()) {
                wordsIndex.put(i++, str);
            }
        }

        while (--i >= 0) {
            sb.append(wordsIndex.get(i)).append(' ');
        }

        return sb.toString().trim();
    }
}
