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
