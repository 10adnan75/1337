class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int nums = 0;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                queue.add(i);
                while (!queue.isEmpty()) {
                    int s = queue.poll();
                    visited[s] = true;
                    for (int j=0; j<n; j++) {
                        if (isConnected[s][j] == 1 && !visited[j]) {
                            queue.add(j);
                        }
                    }
                }
                nums++;
            }
        }
        return nums;
    }
}

// My code: Oct 1, 2024
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int i = 0, c = 0, n = isConnected.length;
        boolean[] visited = new boolean[n];
        for (int[] node: isConnected) {
            if (!visited[i]) {
                visited[i] = true;
                bfs(isConnected, n, i, visited);
                c++;
            }
            i++;
        }
        return c;
    }

    public void bfs(int[][] mat, int n, int i, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int j=0; j<n; j++) {
                if (mat[curr][j] == 1 && !visited[j]) {
                    visited[j] = true;
                    q.add(j);
                }
            }
        }
    }
}
