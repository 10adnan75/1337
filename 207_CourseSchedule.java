// Need to work on this
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = createGraph(numCourses, prerequisites);
        int i=0;
        for (List<Integer> nodes: graph) {
            System.out.print(i++ + "-> ");
            for (int node: nodes) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
        return bfs(numCourses, graph);
    }

    public boolean bfs(int N, ArrayList<Integer>[] graph) {
        boolean[] visited = new boolean[N];
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<graph.length; i++) {
            if (!visited[i]) {
                queue.add(i);
                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    if (visited[node]) {
                        return false;
                    }
                    visited[node] = true;
                    for (int nodes: graph[node]) {
                        queue.add(nodes);
                    }
                }
            }
        }
        return true;
    }

    public ArrayList<Integer>[] createGraph(int N, int[][] edges) {
        ArrayList<Integer>[] graph = new ArrayList[N];
        for (int i=0; i<N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge: edges) {
            graph[edge[0]].add(edge[1]);
        }
        return graph;
    }
}

// Topological sort
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = createGraph(numCourses, prerequisites);
        return bfs(numCourses, graph);
    }

    public boolean bfs(int N, ArrayList<Integer>[] graph) {
        int[] inDegree = new int[N];
        for (int i=0; i<N; i++) {
            for (int n: graph[i]) {
                inDegree[n]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<N; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        int c = 0;
        while (!queue.isEmpty()) {
            c++;
            int curr = queue.poll();
            for (int n: graph[curr]) {
                inDegree[n]--;
                if (inDegree[n] == 0) {
                    queue.add(n);
                }
            }
        }
        return c == N;
    }

    public ArrayList<Integer>[] createGraph(int N, int[][] edges) {
        ArrayList<Integer>[] graph = new ArrayList[N];
        for (int i=0; i<N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge: edges) {
            graph[edge[0]].add(edge[1]);
        }
        return graph;
    }
}
