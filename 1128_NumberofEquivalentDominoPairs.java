class Solution {
    public String hashCode(int[] n) {
        return n[0] + " " + n[1];
    }

    public int computeCombination(int n) {
        return n * (n-1) / 2;
    }

    public int numEquivDominoPairs(int[][] dominoes) {
        int c = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int[] domino: dominoes) {
            Arrays.sort(domino);
            String s = hashCode(domino);
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for (Map.Entry e: map.entrySet()) {
            int val = (int)e.getValue();
            if (val > 1) {
                c += computeCombination(val);
            }
        }
        return c;
    }
}
