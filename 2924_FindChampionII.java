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

// Beats 100% Java users :)
class Solution {
    public int findChampion(int n, int[][] edges) {
        int champ = 0, i = 0, c = 0;
        boolean[] indegree = new boolean[n];
        for (int[] edge: edges) {
            indegree[edge[1]] = true;;
        }
        for (boolean b: indegree) {
            if (!b) {
                champ = i;
                c++;
            }
            i++;
        }
        return c == 1 ? champ : -1;
    }
}
