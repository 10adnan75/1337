class Solution {
    public String losingPlayer(int x, int y) {
        int i = 0;
        while (x >= 1 && y >= 4) {
            x -= 1;
            y -= 4;
            i++;
        }
        return (i&1) == 1 ? "Alice" : "Bob";
    }
}
