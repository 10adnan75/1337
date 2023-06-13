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
