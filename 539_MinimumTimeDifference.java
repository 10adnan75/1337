class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] mins = new int[timePoints.size()];
        for (int i=0; i<timePoints.size(); i++) {
            mins[i] = convert2MM(timePoints.get(i).split(":"));
        }
        Arrays.sort(mins);
        int min = 1440-(mins[mins.length-1]-mins[0]);
        for (int i=1; i<mins.length; i++) {
            min = Math.min(mins[i]-mins[i-1], min);
        }
        return min;
    }

    public int convert2MM(String[] t) {
        return 60 * Integer.parseInt(t[0]) + Integer.parseInt(t[1]);
    }
}