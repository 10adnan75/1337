class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (edges == null) {
            return true;
        }
        boolean flag = true;
        boolean[] visited = new boolean[n];
        visited[source] = true;
        while (flag) {
            flag = false;
            for (int[] edge: edges) {
                if (visited[edge[0]] != visited[edge[1]]) {
                    visited[edge[0]] = true;
                    visited[edge[1]] = true;
                    flag = true;
                }
            }
            if (visited[destination] == true) {
                return true;
            }
        }
        return false;
    }
}
