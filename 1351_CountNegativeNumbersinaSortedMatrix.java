// Brute force, O(M * N)
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

// Binary search, O(M * log N)
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i=0; i<grid.length; i++) {
            int lo = 0, hi = grid[i].length-1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (grid[i][mid] < 0) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
            count += (grid[i].length - lo);
        }
        return count;
    }
}

// Linear traversal, O(M + N)
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int len = grid[0].length;
        int firstNegIdx = len - 1;
        for (int[] row : grid) {
            while (firstNegIdx >= 0 && row[firstNegIdx] < 0) {
                firstNegIdx--;
            }
            count += len - (firstNegIdx + 1);
        }
        return count;
    }
}
