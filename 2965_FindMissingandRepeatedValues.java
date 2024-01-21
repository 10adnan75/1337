class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] freq = new int[grid.length*grid[0].length+1];
        for (int[] row: grid) {
            for (int i: row) {
                freq[i]++;
            }
        }
        int missing = 0, repeated = 0;
        for (int i=1; i<freq.length; i++) {
            if (freq[i] == 0) {
                missing = i;
            }
            if (freq[i] == 2) {
                repeated = i;
            }
        }
        return new int[]{repeated, missing};
    }
}
