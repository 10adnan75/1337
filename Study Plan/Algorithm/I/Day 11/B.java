class Solution {
    
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    int temp = 0;
    
    public List<List<Integer>> permute(int[] nums) {
        backTrack(nums, 0, nums.length-1);
        return ans;
    }
    
    private void backTrack(int[] nums, int lo, int hi) {
        // Backtracking: O(n!)
        if (lo == hi) {
            List<Integer> l = new ArrayList<>();
            for (int i : nums) {
                l.add(i);
            }
            ans.add(l);
            return;
        }
        for (int i=lo; i<=hi; i++) {
            swap(nums, i, lo);
            backTrack(nums, lo+1, hi);
            swap(nums, i, lo);
        }
    }
    
    private void swap(int[] a, int x, int y) {
        if (x == y) {
            return;
        }
        temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
