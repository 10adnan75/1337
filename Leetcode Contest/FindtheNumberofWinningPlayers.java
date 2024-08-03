class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int c = 0;
        List<Map<Integer, Integer>> l = new ArrayList<>();
        for (int i=0; i<n+1; i++) {
            l.add(new HashMap<Integer, Integer>());
        }
        for (int[] p: pick) {
            int i = p[0];
            Map<Integer, Integer> m = l.get(i);
            m.put(p[1], m.getOrDefault(p[1], 0)+1);
        }
        for (int i=0; i<l.size(); i++) {
            Map<Integer, Integer> m = l.get(i);
            for (Map.Entry e: m.entrySet()) {
                if ((int)e.getValue() >= i+1) {
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}
