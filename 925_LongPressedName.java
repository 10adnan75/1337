// I'm stuck, need to improvise this code!

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        // int i = 0, j = 0;
        // while (i < name.length() && j < typed.length()) {
        //     if (name.charAt(i) != typed.charAt(j) && name.charAt(i) == typed.charAt(j-1)) {
        //         i++;
        //     } else if (name.charAt(i) == typed.charAt(j)) {
        //         j++;
        //     } else {
        //         return false;
        //     }
        // }
        // while (j < typed.length()) {
        //     if (typed.charAt(j) != name.charAt(i-1)) {
        //         return false;
        //     }
        //     j++;
        // }
        // return true;
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        int[] letters = new int[26];
        for (int i=0; i<name.length(); i++) {
            map.put(name.charAt(i), map.getOrDefault(name.charAt(i), 0) + 1);
        }
        for (int i=0; i<typed.length(); i++) {
            letters[typed.charAt(i) - 'a']++;
        }
        for (int i=0; i<letters.length; i++) {
            if (letters[i] > 0 && !map.containsKey((char)(i + 'a'))) {
                return false;
            }
        }
        int idx = 0;
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(idx);
            char key = (char)entry.getKey();
            // int value = (int)entry.getValue();
            // if (typed.charAt(idx) != key) {
            //     return false;
            // }
            // if (letters[key - 'a'] < value) {
            //     return false;
            // }
            idx += letters[key - 'a'];
        }
        return true;
    }
}
