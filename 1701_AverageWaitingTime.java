class Solution {
    public double averageWaitingTime(int[][] customers) {
        double avg = 0.0;
        int time = customers[0][0];
        for (int[] customer: customers) {
            if (customer[0] > time) {
                time = customer[0] + customer[1];
            } else {
                time += customer[1];
            }
            avg += (double)(time - customer[0]);
        }
        return avg / customers.length;
    }
}
