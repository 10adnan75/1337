class Solution {
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        if (graph == null || graph.length == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(graph, 0, path, result);
        return result;
    }
    
    public void dfs(int[][] graph, int index, List<Integer> path, List<List<Integer>> result) {
        path.add(index);
        if (index == graph.length-1) {
            result.add(new ArrayList<>(path));
            path.remove(path.size()-1);
            return;
        }
        for (int i=0; i<graph[index].length; i++) {
            dfs(graph, graph[index][i], path, result);
        }
        path.remove(path.size()-1);
    }
}
