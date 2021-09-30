class Solution {
    
    private List<List<Integer>> ans = new ArrayList<List<Integer>>();
    
    private void backTrack(int n, int k, int begin, Stack<Integer> stack) {
        if (stack.size() == k) {
            ans.add(new ArrayList<>(stack));
            return;
        }
        for (int i=begin; i<=n-(k-stack.size())+1; i++) {
            stack.add(i);
            backTrack(n, k, i+1, stack);
            stack.pop();
        }
    }
    
    public List<List<Integer>> combine(int n, int k) {
        if (n <= 0 || k <= 0 || n < k) {
            return ans;
        }
        backTrack(n, k, 1, new Stack<>());
        return ans;
    }
}
