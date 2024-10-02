import java.util.*;

class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length, i = 0;
        int[] visited = new int[n];
        for (int[] g: graph) {
            if (visited[i] == 0) {
                Queue<Integer> q = new LinkedList<>(List.of(i));
                visited[i] = 1;
                while (!q.isEmpty()) {
                    int node = q.poll();
                    for (int j = 0; j < graph[node].length; j++) {
                        int curr = graph[node][j];
                        if (visited[curr] == visited[node]) {
                            return false;
                        }
                        if (visited[curr] == 0) {
                            q.add(curr);
                            visited[curr] = visited[node] == 1 ? 2 : 1;
                        }
                    }
                }
            }
            i++;
        }
        return true;
    }
}
