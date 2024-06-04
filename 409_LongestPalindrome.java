class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> data = new HashSet<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (data.contains(c)) {
                count += 2;
                data.remove(c);
            } else {
                data.add(c);
            }
        }
        if (data.size() > 0) {
            count++;
        }
        return count;
    }
}

// My code: 2 ms :)
class Solution {
    public int longestPalindrome(String s) {
        int[] freqL = new int[26], freqU = new int[26];
        int c = 0;
        for (char ch: s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                freqL[ch-'a']++;
            } else {
                freqU[ch-'A']++;
            }
        }
        for (int i=0; i<26; i++) {
            int l = freqL[i], u = freqU[i];
            if (l > 0) {
                c += (l&1) == 1 ? l-1 : l;
            }
            if (u > 0) {
                c += (u&1) == 1 ? u-1 : u;
            }
        }
        for (int i=0; i<26; i++) {
            if ((freqL[i]&1) == 1 || (freqU[i]&1) == 1) {
                return c+1;
            }
        }
        return c;
    }
}
