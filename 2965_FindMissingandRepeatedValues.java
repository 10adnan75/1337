// INDIA
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

// UNITED STATES
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        Set<Integer> set = new HashSet<>();

        for (int[] row: grid) {
            for (int val: row) {
                if (set.contains(val)) {
                    ans[0] = val;
                }

                set.add(val);
            }
        }

        for (int i=1; i<=Math.pow(grid.length, 2); i++) {
            if (!set.contains(i)) {
                ans[1] = i;
                return ans;
            }
        }

        return ans;
    }
}
