class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        dfs(result, new ArrayList<>(), nums, 0); 
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> list, int[] nums, int depth) {
        if (depth >= nums.length) { 
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[depth]);
        dfs(result, list, nums, depth+1);
        list.remove(list.size()-1);
        dfs(result, list, nums, depth+1);
    }
}
