class Solution {
    private int N;

    public int finalPositionOfSnake(int n, List<String> commands) {
        int curr = 0;
        this.N = n;
        for (String c: commands) {
            curr += command(c);
        }
        return curr;
    }

    public int command(String c) {
        switch(c) {
            case "UP": return -this.N;
            case "DOWN": return this.N;
            case "RIGHT": return 1;
            case "LEFT": return -1;
        }
        return 0;
    }
}
