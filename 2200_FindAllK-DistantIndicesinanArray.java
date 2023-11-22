class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> keys = new ArrayList<>(), ans = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == key) {
                keys.add(i);
            }
        }
        for (int i=0; i<nums.length; i++) {
            for (int j: keys) {
                if (Math.abs(i-j) <= k) {
                    ans.add(i);
                    break;
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
