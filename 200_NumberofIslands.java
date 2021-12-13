class Solution {
    int[] dx = new int[] { 0, 0, 1, -1 };
    int[] dy = new int[] { 1, -1, 0, 0 };

    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[][] visit = new int[r][c];

        Queue<Node> q = new LinkedList<>();
        int ans = 0;

        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if (grid[i][j] == '0') {
                    continue;
                }
                if (visit[i][j] == 1) {
                    continue;
                }
                ans++;
                q.add(new Node(i, j));
                visit[i][j] = 1;
                while (!q.isEmpty()) {
                    Node node = q.poll();
                    for (int k=0; k<4; k++) {
                        int nx = node.x + dx[k];
                        int ny = node.y + dy[k];
                        if (nx<0 || nx>=r || ny<0 || ny>=c) {
                            continue;
                        }
                        if (grid[nx][ny] != '0' && visit[nx][ny] != 1) {
                            visit[nx][ny] = 1;
                            q.add(new Node(nx, ny));
                        }
                    }
                }
            }
        }
        return ans;
    }

    class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
