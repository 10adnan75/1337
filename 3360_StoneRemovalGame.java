class Solution {
    public boolean canAliceWin(int n) {
        if (n < 10) {
            return false;
        }
        int c = 10;
        boolean alice = c <= n ? false : true;
        while (n >= c) {
            n -= c;
            c--;
            alice = !alice;
        }
        return alice;
    }
}
