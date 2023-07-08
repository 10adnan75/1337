class Solution {
    public boolean isAsubstring(String a, String b) {
        // int start = 0;
        // for (int i=0; i<b.length(); i++) {
        //     int j = 0;
        //     if (b.charAt(i) == a.charAt(j)) {
        //         start = i + 1;
        //         j = j + 1;
        //         while (j < a.length() && start < b.length()) {
        //             if (a.charAt(j) != b.charAt(start)) {
        //                 j = 0;
        //                 break;
        //             } else {
        //                 start++;
        //                 j++;
        //             }
        //         }
        //         if (j != 0 && b.charAt(start-1) == a.charAt(j-1)) {
        //             return true;
        //         }
        //     }
        // }
        for (int i=0; i<=b.length()-a.length(); i++) {
            int j = 0;
            while (j < a.length()) {
                if (b.charAt(i+j) != a.charAt(j)) {
                    break;
                }
                j++;
            }
            if (j == a.length()) {
                return true;
            }
        }
        return false;
    }

    public int numOfStrings(String[] patterns, String word) {
        Map<String, Boolean> map = new HashMap<>();
        int c = 0;
        for (String pattern : patterns) {
            if (map.containsKey(pattern)) {
                c++;
                continue;
            }
            if (isAsubstring(pattern, word)) {
                c++;
                map.put(pattern, true);
            }
        }
        return c;
    }
}
