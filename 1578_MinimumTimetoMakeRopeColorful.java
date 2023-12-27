class Solution {
    public int minCost(String colors, int[] neededTime) {
        int cost = 0, i = 0;
        while (i < colors.length()-1) {
            int j = i+1;
            while (j < colors.length() && colors.charAt(i) == colors.charAt(j)) {
                j++;
            }
            if (j != i+1) {
                cost += getMin(i, j-1, neededTime);
                i = j-1;
            }
            i++;
        }
        return cost;
    }

    public int getMin(int i, int j, int[] a) {
        int max = a[j], sum = a[j];
        for (int x=i; x<j; x++) {
            sum += a[x];
            max = Math.max(a[x], max);
        }
        return sum - max;
    }
}
