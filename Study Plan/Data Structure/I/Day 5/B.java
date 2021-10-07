class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int lo = 0, hi = rows*cols-1;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            int value = matrix[mid/cols][mid%cols];
            if (value > target) {
                hi = mid - 1;
            } else if (value < target) {
                lo = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
