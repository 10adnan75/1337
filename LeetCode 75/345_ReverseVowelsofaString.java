import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        List<Integer> indexes = new ArrayList<>();
        char[] chars = s.toCharArray();
        int i = 0;

        for (char c : s.toCharArray()) {
            if (isAVowel(c)) {
                sb.append(c);
                indexes.add(i);
            }
            i++;
        }
        
        i = indexes.size() - 1;

        for (int index: indexes) {
            chars[index] = sb.charAt(i--);
        }

        return new String(chars);
    }

    public boolean isAVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
