// intuitive approach - 16 ms
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if (map1.containsKey(s.charAt(i))) {
                if (map1.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                map1.put(s.charAt(i), t.charAt(i));
            }
        }
        for (int i=0; i<t.length(); i++) {
            if (map2.containsKey(t.charAt(i))) {
                if (map2.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                map2.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}

// redundancy elimination - 11 ms
class Solution {
    public boolean isIsomorphic(String s, String t) {
        return helper(s, t) && helper(t, s);
    }

    public boolean helper(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}

// 43/45 test cases passed! (need to work on this)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        return helper(s, t) && getOrder(s).equals(getOrder(t));
    }

    public String getOrder(String str) {
        String o = "";
        int i = 0, c = 1;
        while (i < str.length()) {
            char ch = str.charAt(i);
            int j = i + 1;
            while (j < str.length() && str.charAt(j) == ch) {
                j++;
                c++;
            }
            o += c;
            c = 1;
            i = j;
        }
        return o;
    }

    public boolean helper(String s, String t) {
        int[] f1 = new int[256], f2 = new int[256];
        int c = 0, v = 0;
        for (char ch: s.toCharArray()) {
            f1[ch]++;
        }
        for (char ch: t.toCharArray()) {
            f2[ch]++;
        }
        for (int i: f1) {
            if (i != 0) {
                c++;
                v += i;
            }
        }
        for (int i: f2) {
            if (i != 0) {
                c--;
                v -= i;
            }
        }
        return c != 0 ? false : v != 0 ? false : true; 
    }
}
