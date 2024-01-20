class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int n = nums.size();
        Set<Integer> s = new HashSet<>();
        for (int i=n-1; i>=0; i--) {
            if (nums.get(i) <= k) {
                s.add(nums.get(i));
            }
            if (s.size() == k) {
                return n-i;
            }
        }
        return 0;
    }
}
