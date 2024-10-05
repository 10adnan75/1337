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

// My code: Oct 5, 2024
class Solution {
    private int m, n, islands;
    private boolean[][] visited;

    public int numIslands(char[][] grid) {
        this.islands = 0; this.m = grid.length; this.n = grid[0].length;
        this.visited = new boolean[this.m][this.n];
        for (int i=0; i<this.m; i++) {
            for (int j=0; j<this.n; j++) {
                if (grid[i][j] == '1' && !this.visited[i][j]) {
                    this.islands++;
                    this.visited[i][j] = true;
                    bfs(grid, i, j);
                }
            }
        }
        return this.islands;
    }

    public void bfs(char[][] grid, int currI, int currJ) {
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new Pair(currI, currJ));
        while (!queue.isEmpty()) {
            Pair<Integer, Integer> p = queue.poll();
            int i = p.getKey(), j = p.getValue();
            if (i > 0 && grid[i-1][j] == '1' && !this.visited[i-1][j]) {
                this.visited[i-1][j] = true;
                queue.add(new Pair(i-1, j));
            }      
            if (i < this.m-1 && grid[i+1][j] == '1' && !this.visited[i+1][j]) {
                this.visited[i+1][j] = true;
                queue.add(new Pair(i+1, j));
            }  
            if (j > 0 && grid[i][j-1] == '1' && !this.visited[i][j-1]) {
                this.visited[i][j-1] = true;
                queue.add(new Pair(i, j-1));
            }  
            if (j < this.n-1 && grid[i][j+1] == '1' && !this.visited[i][j+1]) {
                this.visited[i][j+1] = true;
                queue.add(new Pair(i, j+1));
            }  
        }
    }
}
