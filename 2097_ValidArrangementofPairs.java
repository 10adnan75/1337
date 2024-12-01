// Nov 30, 2024, USA, 18:05
// Need to work on this!
class Solution {
    public int[][] validArrangement(int[][] pairs) {
        int start = -1;
        Map<Integer, Integer> inDegree = new HashMap<>();
        Map<Integer, List<Integer>> mapping = new HashMap<>();

        for (int[] pair: pairs) {
            int left = pair[0], right = pair[1];
            List<Integer> neighbors = new ArrayList<>();

            inDegree.put(left, inDegree.getOrDefault(left, 0)+1);
            inDegree.put(right, inDegree.getOrDefault(right, 0)-1);

            if (mapping.containsKey(left)) {
                neighbors = mapping.get(left);
            }

            neighbors.add(right);
            mapping.put(left, neighbors);
        }

        for (Map.Entry<Integer, Integer> e: inDegree.entrySet()) {
            if (e.getValue() == 1) {
                start = e.getKey();
                break;
            }
        }

        System.out.println(inDegree);
        System.out.println(mapping);

        if (start == -1) {
            return pairs;
        }
        
        return pairs;
    }
}
