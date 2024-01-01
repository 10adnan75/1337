class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, int[]> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int[] val = new int[2];
            if (map.containsKey(c)) {
                val[0] = map.get(c)[0];
                val[1] = i;
            } else {
                val[0] = i;
            }
            map.put(c, val);
        }
        int max = -1;
        for (Map.Entry e: map.entrySet()) {
            int[] val = (int[])e.getValue();
            if (val[1] != 0) {
                max = Math.max(max, val[1]-val[0]-1);
            }
            // System.out.println(e.getKey() + " -> [" + val[0] + ", " + val[1] + "]");
        }
        return max;
    }
}
