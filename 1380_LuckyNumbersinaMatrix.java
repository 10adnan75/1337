class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int[] row: matrix) {
            int min = Integer.MAX_VALUE;
            for (int i: row) {
                min = Math.min(min, i);
            }
            set.add(min);
        }
        for (int i=0; i<matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j=0; j<matrix.length; j++) {
                max = Math.max(max, matrix[j][i]);
            }
            if (set.contains(max)) {
                ans.add(max);
            }
        }
        return ans;
    }
}

// July 19, 2024
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> mins = new HashSet<>();
        for (int[] row: matrix) {
            mins.add(getMin(row));
        }
        for (int i=0; i<matrix[0].length; i++) {
            int max = 0;
            for (int j=0; j<matrix.length; j++) {
                max = Math.max(max, matrix[j][i]);
            }
            if (mins.contains(max)) {
                ans.add(max);
            }
        }
        return ans;
    }

    public int getMin(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i: a) {
            min = Math.min(min, i);
        }
        return min;
    }
}
