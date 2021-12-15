public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        if(num == null || num.length == 0) {
            return res;
        }
        Arrays.sort(num);
        List<Integer> list = new ArrayList<>();
        dfs(num, 0, list, 0, target);
        return res;
    }

    private void dfs(int[] num, int start, List<Integer> list, int sum, int target) {
        if (sum == target) {
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i=start; i<num.length; i++) {
            if (i > start && num[i] == num[i-1]) {
                continue;
            }
            if (num[i]+sum <= target) {
                list.add(num[i]);
                dfs(num, i+1, list, sum+num[i], target);
                list.remove(list.size()-1);
            }
        }
    }
}
