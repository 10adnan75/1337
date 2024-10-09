// my code: need to work on this!
class Solution {
    Map<Integer, List<Integer>> map;

    public int[] findRedundantConnection(int[][] edges) {
        map = new HashMap<>();
        for (int[] edge: edges) {
            int key = edge[0];
            List<Integer> nodes = new ArrayList<>();
            if (map.containsKey(key)) {
                nodes = map.get(key);
            }
            nodes.add(edge[1]);
            map.put(key, nodes);
        }
        int n = edges.length;
        int cycle = bfs(n);
        for (int i=n-1; i>=0; i--) {
            if (edges[i][1] == cycle) {
                cycle = i;
                break;
            }
        }
        return edges[cycle];
    }


    public int bfs(int n) {
        boolean[] visited = new boolean[n+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        while (!queue.isEmpty()) {
            int key = queue.poll();
            if (visited[key]) {
                return key;
            }
            visited[key] = true;
            if (map.containsKey(key)) {
                for (int nodes: map.get(key)) {
                    queue.add(nodes);
                }
            }
        }
        return 0;
    }
}
