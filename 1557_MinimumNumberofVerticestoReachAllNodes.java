class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] l = new int[n];    
        for (List<Integer> e : edges) {
            l[e.get(1)]++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i=0; i<n; i++) {
            if (l[i] == 0) {
                ans.add(i);
            }
        }
        return ans;   
    }
}
