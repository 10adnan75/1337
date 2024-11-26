class Solution {
    public int findChampion(int n, int[][] edges) {
        int champ = 0;
        Set<Integer> set = new HashSet<>();
        for (int[] edge: edges) {
            set.add(edge[1]);
        }
        if (set.size() != n-1) {
            return -1;
        }
        for (int i=0; i<n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
