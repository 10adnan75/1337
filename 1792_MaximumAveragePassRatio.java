import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    static class Ratio {
        private final int pass;
        private final int total;
        private final double ratio;
        private final double maxima;

        public Ratio(int pass, int total, double ratio, double maxima) {
            this.pass = pass;
            this.total = total;
            this.ratio = ratio;
            this.maxima = maxima;
        }
    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<Ratio> ratios = new PriorityQueue<>(Collections.reverseOrder(Comparator.comparingDouble(x -> x.maxima)));
        for (int[] c: classes) {
            int pass = c[0], total = c[1];
            double currRatio = (double) pass / total;
            double newRatio = (double) (pass+1) / (total+1);
            ratios.offer(new Ratio(pass, total, currRatio, Math.abs(currRatio - newRatio)));
        }
        while (extraStudents-- > 0) {
            Ratio ratio = ratios.poll();
            if (ratio == null) break;
            int pass = ratio.pass+1, total = ratio.total+1;
            double currRatio = (double) pass / total;
            double newRatio = (double) (pass+1) / (total+1);
            ratios.offer(new Ratio(pass, total, currRatio, Math.abs(currRatio - newRatio)));
        }
        double sum = 0.0;
        for (Ratio ratio: ratios) {
            sum += ratio.ratio;
        }
        return sum / (double) classes.length;
    }
}
