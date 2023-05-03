class Solution {
    public double average(int[] salary) {
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i : salary) {
            max = Math.max(max, i);
            min = Math.min(min, i);
            sum += i;
        }
        return (double)(sum - max - min) / (double)(salary.length - 2);
    }
}
