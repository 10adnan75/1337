// without order
class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = speed.length;
        double[] time = new double[n];
        for (int i=0; i<n; i++) {
            time[i] = dist[i] / (double)speed[i];
        }
        int c = 0;
        Arrays.sort(time);
        for (int i=0; i<n; i++) {
            if (time[i] <= i) {
                break;
            }
            c++;
        }
        return c;
    }
}

// with order
