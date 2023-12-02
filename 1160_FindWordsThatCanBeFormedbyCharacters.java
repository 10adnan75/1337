// Optimized :)
class Solution {
    int[] freq = new int[26];

    public boolean check(String word) {
        int[] aux = Arrays.copyOf(freq, freq.length);
        for (char ch: word.toCharArray()) {
            if (aux[ch-'a'] == 0) {
                return false;
            }
            aux[ch-'a']--;
        }
        return true;
    }

    public int countCharacters(String[] words, String chars) {
        int c = 0;
        for (char ch: chars.toCharArray()) {
            freq[ch-'a']++;
        }
        for (String word: words) {
            if (check(word)) {
                c += word.length();
            }
        }
        return c;
    }
}

// My code
class Solution {
    public int[] character = new int[26];

    public boolean check(String word) {
        int[] tempChar = new int[26];
        for (int i=0; i<word.length(); i++) {
            tempChar[word.charAt(i)-'a']++;
        }
        for (int i=0; i<26; i++) {
            if (tempChar[i] > character[i]) {
                return false;
            }
        }
        return true;
    }

    public int countCharacters(String[] words, String chars) {
        int c = 0;
        for (int i=0; i<chars.length(); i++) {
            character[chars.charAt(i)-'a']++;
        }
        for (String word : words) {
            if (check(word)) {
                c += word.length();
            }
        }
        return c;
    }
}

// My modified code 
class Solution {
    public int[] character;

    public int[] helper(String s) {
        int[] a = new int[26];
        for (int i=0; i<s.length(); i++) {
            a[s.charAt(i)-'a']++;
        }
        return a;
    }

    public boolean check(String word) {
        int[] tempChar = helper(word);
        for (int i=0; i<26; i++) {
            if (tempChar[i] > character[i]) {
                return false;
            }
        }
        return true;
    }

    public int countCharacters(String[] words, String chars) {
        int c = 0;
        character = helper(chars);
        for (String word : words) {
            if (check(word)) {
                c += word.length();
            }
        }
        return c;
    }
}
