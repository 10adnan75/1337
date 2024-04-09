class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int c = 0, f = 0;
        while (true) {
            for (int i=0; i<tickets.length; i++) {
                if (tickets[i] != 0) {
                    c++;
                    tickets[i]--;
                }
                if (i == k && tickets[i] == 0) {
                    f = -1;
                    break;
                }
            }
            if (f == -1) {
                break;
            }
        }
        return c;
    }
}
