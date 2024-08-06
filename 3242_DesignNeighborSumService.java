class neighborSum {
    private int N;
    private int[][] grid;
    private Map<Integer, int[]> map;

    public neighborSum(int[][] grid) {
        this.N = grid.length;
        this.grid = grid;
        this.map = new TreeMap<>();
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                this.map.put(grid[i][j], new int[] {i, j});
            }
        }
    }
    
    public int adjacentSum(int value) {
        int i = this.map.get(value)[0], j = this.map.get(value)[1], sum = 0;
        sum += i+1 <= this.N-1 ? this.grid[i+1][j] : 0;
        sum += j+1 <= this.N-1 ? this.grid[i][j+1] : 0;
        sum += i-1 >= 0 ? this.grid[i-1][j] : 0;
        sum += j-1 >= 0 ? this.grid[i][j-1] : 0;
        return sum;
    }
    
    public int diagonalSum(int value) {
        int i = this.map.get(value)[0], j = this.map.get(value)[1], sum = 0;
        boolean top = i-1 >= 0 ? true : false, bottom = i+1 <= this.N-1 ? true : false, left = j-1 >= 0 ? true : false, right = j+1 <= this.N-1 ? true : false;
        if (top && left) {
            sum += this.grid[i-1][j-1];
        }
        if (top && right) {
            sum += this.grid[i-1][j+1];
        }
        if (bottom && left) {
            sum += this.grid[i+1][j-1]; 
        }
        if (bottom && right) {
            sum += this.grid[i+1][j+1];
        }
        return sum;
    }
}

/**
 * Your neighborSum object will be instantiated and called as such:
 * neighborSum obj = new neighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */
