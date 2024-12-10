class Solution {
    public int maximumLength(String s) {
        Map<String, Integer> map = new HashMap<>();
        int n = s.length(), c = 0;
        for (int i=0; i<n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=i; j<n; j++) {
                sb.append(s.charAt(j));
                String key = sb.toString();
                if (map.containsKey(key)) {
                    map.put(key, map.get(key)+1);
                } else if (isSpecial(key)) {
                    map.put(key, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> e: map.entrySet()) {
            if (e.getValue() >= 3) {
                c = Math.max(c, e.getKey().length());
            }
        }
        return c == 0 ? -1 : c;
    }

    public boolean isSpecial(String s) {
        char c = s.charAt(0);
        for (int i=1; i<s.length(); i++) {
            if (s.charAt(i) != c) {
                return false;
            }
        }
        return true;
    }
}
