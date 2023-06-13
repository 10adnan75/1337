// My solution.
class Solution {
    public int equalPairs(int[][] grid) {
        int pairs = 0;
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        for (int[] row : grid) {
            List<Integer> r = Arrays.stream(row).boxed().toList();
            map.put(r, map.getOrDefault(r, 0) + 1);
        }

        // for (Map.Entry<List<Integer>, Integer> entry : map.entrySet()) 
        //     System.out.println("Key = " + entry.getKey() +
        //                      ", Value = " + entry.getValue());

        List<List<Integer>> col = new ArrayList<>();
        for (int i=0; i<grid.length; i++) {
            List<Integer> c = new ArrayList<>();
            for (int j=0; j<grid.length; j++) {
                c.add(grid[j][i]);
            }
            col.add(c);
        }

        for (int i=0; i<col.size(); i++) {
            // pairs += map.getOrDefault(col.get(i), 0) + 1;
            if (map.containsKey(col.get(i))) {
                pairs += map.get(col.get(i));
            }
        }

        return pairs;
    }
}

// Consumes somewhat less memory than the above solution.
class Solution {
    public int equalPairs(int[][] grid) {
        int pairs = 0;
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        for (int[] row : grid) {
            List<Integer> r = Arrays.stream(row).boxed().toList();
            map.put(r, map.getOrDefault(r, 0) + 1);
        }
        for (int i=0; i<grid.length; i++) {
            List<Integer> c = new ArrayList<>();
            for (int j=0; j<grid.length; j++) {
                c.add(grid[j][i]);
            }
            pairs += map.getOrDefault(c, 0);
        }
        return pairs;
    }
}

// Best solution.
class Solution {
    public int equalPairs(int[][] grid) {
        int pairs = 0;
        int n = grid.length;
        long[] rows = new long[n];
        long[] cols = new long[n];
        for (int i=0; i<n; i++) {
            long sum = 0;
            for (int j=0; j<n; j++) {
                sum = grid[i][j] + sum * 10;
            }
            rows[i] = sum;
        }
        for (int i=0; i<n; i++) {
            long sum = 0;
            for (int j=0; j<n; j++) {
                sum = grid[j][i] + sum * 10;
            }
            cols[i] = sum;
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (rows[i] == cols[j]) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
